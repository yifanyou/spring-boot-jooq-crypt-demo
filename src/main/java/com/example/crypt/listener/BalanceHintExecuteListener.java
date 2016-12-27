package com.example.crypt.listener;

import com.mysql.jdbc.JDBC4Connection;
import org.jooq.ExecuteContext;
import org.jooq.ExecuteType;
import org.jooq.impl.DefaultExecuteListener;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

/**
 * Created by youyifan on 2016/12/24.
 */
@Component
public class BalanceHintExecuteListener extends DefaultExecuteListener {
    @Override
    public void start(ExecuteContext ctx) {
        //执行时间 start
        ctx.data("time", System.nanoTime());
    }

    @Override
    public void renderEnd(ExecuteContext ctx) {
        if(ExecuteType.READ.equals(ctx.type())) {
            try {
                boolean isReadOnly =
                        ((JDBC4Connection)ctx.connection().getMetaData().getConnection()).isReadOnly(false);
                boolean autoCommit = ctx.connection().getAutoCommit();
                if(isReadOnly || autoCommit) {
                    ctx.sql("/*balance*/" + ctx.sql());
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void end(ExecuteContext ctx) {
        Long time = (Long) ctx.data("time");
        System.out.println("Execution time : " + ((System.nanoTime() - time) / 1000 / 1000.0) + "ms. Query : " + ctx.sql());
    }
}
