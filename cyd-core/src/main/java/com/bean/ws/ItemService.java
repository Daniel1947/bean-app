package com.bean.ws;

import com.bean.model.data.item.ItemVO;
import com.bean.model.proxy.ItemProxy;
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
 * Created by Daniel on 14-8-20.
 */
@Path("/item")
public class ItemService {
    @Path("/all")
    @GET
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllItems() throws Exception{

        List<ItemVO> allItems = ItemProxy.getAllItems();
        Map<String, List> result = new HashMap<String, List>();
        result.put("items", allItems);
        return ServiceUtil.buildResponse(result);
    }
}