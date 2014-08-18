package com.bean.model.dao.user;

import com.bean.model.dao.DBConstants;
import com.bean.model.data.user.UserVO;
import com.bean.model.persistance.jdbc.user.User;
import com.bean.util.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel on 14-8-17.
 */
public class UserDAO {
    public List<UserVO> getAllUsers() throws Exception{
        Connection con = DBConnection.getConnection();
        List<UserVO> allUsers = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = con.createStatement();
            rs = statement.executeQuery(DBConstants.GET_ALL_USERS);

            while (rs.next()) {
                if (allUsers == null) {
                    allUsers = new ArrayList<UserVO>();
                }
                User user = new User();
                user.setUserDname(rs.getString("user_dname"));
                user.setUserLoginName(rs.getString("user_login_name"));
                user.setUserLoginPwd(rs.getString("user_login_pwd"));
                user.setUserMobile(rs.getString("user_mobile"));
                user.setUserEmail(rs.getString("user_email"));
                user.setUserId(Long.valueOf(rs.getInt("user_id")));
                UserVO vo = (UserVO)user.getState();
                allUsers.add(vo);
            }
        } catch (SQLException e) {
            throw new Exception(e);
        } finally{
            DBConnection.closeConnection(con);
        }
        return allUsers;
    }

}

