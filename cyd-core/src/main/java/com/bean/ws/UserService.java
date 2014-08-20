package com.bean.ws;

import com.bean.model.data.user.UserVO;
import com.bean.model.proxy.UserProxy;
import com.bean.util.ServiceUtil;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Daniel on 14-8-18.
 */
@Path("/user")
public class UserService {
    @Path("/all")
    @GET
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllStores() throws Exception{

        List<UserVO> allUser = UserProxy.getAllUsers();
        Map<String, List> result = new HashMap<String, List>();
        result.put("users", allUser);
        return ServiceUtil.buildResponse(result);
    }
}
