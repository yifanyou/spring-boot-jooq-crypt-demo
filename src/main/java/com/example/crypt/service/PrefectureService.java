package com.example.crypt.service;

import static com.example.crypt.domain.jooq.Tables.*;

import org.jooq.DSLContext;
import org.jooq.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crypt.domain.jooq.tables.records.PrefectureRecord;

@Service
public class PrefectureService {
  private static Logger logger = LoggerFactory.getLogger(PrefectureService.class);

  private final DSLContext create;

  @Autowired
  public PrefectureService(DSLContext dslContext) {
    this.create = dslContext;
  }

  public Result<PrefectureRecord> findAll() {
    Result<PrefectureRecord> result = create.selectFrom(PREFECTURE).fetch();
    return result;
  }

}
