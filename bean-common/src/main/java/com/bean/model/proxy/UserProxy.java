package com.bean.model.proxy;

import com.bean.model.dao.user.UserDAO;
import com.bean.model.data.user.UserVO;
import com.bean.model.session.user.UserSession;

import javax.naming.InitialContext;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

/**
 * Created by Daniel on 14-8-17.
 */
public class UserProxy extends BaseProxy{
    public UserProxy() {
        super();
    }

    private static InitialContext initialContext = null;

    /**
     * Junit tester can seed its own initialContext before calling any method on this.
     * @param _initialContext
     */
    public static void setInitialContext(InitialContext _initialContext)
    {
        initialContext = _initialContext;
    }

    public static InitialContext getInitialContext()
    {
        return initialContext;
    }

    public static List<UserVO> getAllUsers()throws Exception{
        if(persistanceModel == PersistanceModel.JDBC){
            UserDAO userDao = new UserDAO();
            return userDao.getAllUsers();
        }else if(persistanceModel == PersistanceModel.JPA){
            UserSession userSession = BeanAppServerProxy.getUserSession();
            return userSession.getAllUsers();
        }
        return null;
    }
}
