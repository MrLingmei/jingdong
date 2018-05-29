package com.example.administrator.jingdong.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.administrator.jingdong.bean.SqlUser;

import com.example.administrator.jingdong.gen.SqlUserDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig sqlUserDaoConfig;

    private final SqlUserDao sqlUserDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        sqlUserDaoConfig = daoConfigMap.get(SqlUserDao.class).clone();
        sqlUserDaoConfig.initIdentityScope(type);

        sqlUserDao = new SqlUserDao(sqlUserDaoConfig, this);

        registerDao(SqlUser.class, sqlUserDao);
    }
    
    public void clear() {
        sqlUserDaoConfig.clearIdentityScope();
    }

    public SqlUserDao getSqlUserDao() {
        return sqlUserDao;
    }

}
