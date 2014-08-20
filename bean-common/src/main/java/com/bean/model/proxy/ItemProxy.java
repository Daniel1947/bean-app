package com.bean.model.proxy;

import com.bean.model.dao.item.ItemDAO;
import com.bean.model.data.item.ItemVO;

import javax.naming.InitialContext;
import java.util.List;

/**
 * Created by Daniel on 14-8-20.
 */
public class ItemProxy extends BaseProxy{
    public ItemProxy() {
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

    public static List<ItemVO> getAllItems()throws Exception{
        if(persistanceModel == BaseProxy.PersistanceModel.JDBC){
            ItemDAO itemDao = new ItemDAO();
            return itemDao.getAllItems();
        }else if(persistanceModel == BaseProxy.PersistanceModel.JPA){
            //TODO add jpa session here
        }
        return null;
    }
}
