/**
 * This class is generated by jOOQ
 */
package com.example.jooq.db;


import com.example.jooq.db.tables.Actor;
import com.example.jooq.db.tables.Prefecture;
import com.example.jooq.db.tables.records.ActorRecord;
import com.example.jooq.db.tables.records.PrefectureRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>jooqdb</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<ActorRecord, Integer> IDENTITY_ACTOR = Identities0.IDENTITY_ACTOR;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ActorRecord> KEY_ACTOR_PRIMARY = UniqueKeys0.KEY_ACTOR_PRIMARY;
    public static final UniqueKey<PrefectureRecord> KEY_PREFECTURE_PRIMARY = UniqueKeys0.KEY_PREFECTURE_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<ActorRecord, Integer> IDENTITY_ACTOR = createIdentity(Actor.ACTOR, Actor.ACTOR.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<ActorRecord> KEY_ACTOR_PRIMARY = createUniqueKey(Actor.ACTOR, "KEY_actor_PRIMARY", Actor.ACTOR.ID);
        public static final UniqueKey<PrefectureRecord> KEY_PREFECTURE_PRIMARY = createUniqueKey(Prefecture.PREFECTURE, "KEY_prefecture_PRIMARY", Prefecture.PREFECTURE.ID);
    }
}