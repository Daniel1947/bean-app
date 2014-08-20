package com.bean.model.dao.item;

import com.bean.model.dao.DBConstants;
import com.bean.model.data.item.ItemVO;
import com.bean.model.data.user.UserVO;
import com.bean.model.persistance.jdbc.item.Item;
import com.bean.model.persistance.jdbc.user.User;
import com.bean.util.DBConnection;
import com.bean.util.FormatUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel on 14-8-20.
 */
public class ItemDAO {
    public List<ItemVO> getAllItems() throws Exception{
        Connection con = DBConnection.getConnection();
        List<ItemVO> allItems = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = con.createStatement();
            rs = statement.executeQuery(DBConstants.GET_ALL_ITEMS);

            /*
            `item_id` int(11) NOT NULL AUTO_INCREMENT,
              `item_name` varchar(255) NOT NULL,
              `item_picture1` varchar(255) NOT NULL,
              `item_picture2` varchar(255) DEFAULT NULL,
              `item_picture3` varchar(255) DEFAULT NULL,
              `item_picture4` varchar(255) DEFAULT NULL,
              `item_picture5` varchar(255) DEFAULT NULL,
              `item_description` varchar(255) NOT NULL,
              `item_used` int(11) NOT NULL,
              `item_seller_id` int(11) NOT NULL,
              `item_max_price` double NOT NULL,
              `item_min_price` double NOT NULL,
              `item_onshelf_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
              `item_auc_length` int(11) NOT NULL,
              `item_add_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
             */
            while (rs.next()) {
                if (allItems == null) {
                    allItems = new ArrayList<ItemVO>();
                }
                Item item = new Item();
                item.setItemId(Long.valueOf(rs.getInt("item_id")));
                item.setItemName(rs.getString("item_name"));
                item.setItemPicture1(rs.getString("item_picture1"));
                item.setItemPicture2(rs.getString("item_picture2"));
                item.setItemPicture3(rs.getString("item_picture3"));
                item.setItemPicture4(rs.getString("item_picture4"));
                item.setItemPicture5(rs.getString("item_picture5"));
                item.setItemDescription(rs.getString("item_description"));
                item.setItemUsed(Long.valueOf(rs.getInt("item_used")));
                item.setItemSellerId(Long.valueOf(rs.getInt("item_seller_id")));
                item.setItemMaxPrice(rs.getDouble("item_max_price"));
                item.setItemMinPrice(rs.getDouble("item_min_price"));
                item.setItemOnShelfTime(FormatUtil.formatTimeAsStringFromTimestamp(rs.getTimestamp("item_onshelf_time")));
                item.setItemAucLength(Long.valueOf(rs.getInt("item_auc_length")));
                item.setItemAddTime(FormatUtil.formatTimeAsStringFromTimestamp(rs.getTimestamp("item_add_time")));

                ItemVO vo = (ItemVO)item.getState();
                vo.setItemSellerName(getSellerNameByItemId(item.getItemId()));
                allItems.add(vo);
            }
        } catch (SQLException e) {
            throw new Exception(e);
        } finally{
            DBConnection.closeConnection(con);
        }
        return allItems;
    }

    public String getSellerNameByItemId(Long itemId){
        //TODO add query

        return "seller";
    }

}
