package com.bean.model.persistance.jdbc.item;

import com.bean.model.Entity;
import com.bean.model.data.item.ItemIF;
import com.bean.model.data.item.ItemVO;
import com.bean.model.persistance.EntityUpdatable;
import com.bean.model.persistance.PersistanceUtil;

import java.io.Serializable;

/**
 * Created by Daniel on 14-8-20.
 */
public class Item  implements ItemIF, EntityUpdatable, Serializable {
    private Long itemId;
    private String itemName;
    private String itemPicture1;
    private String itemPicture2;
    private String itemPicture3;
    private String itemPicture4;
    private String itemPicture5;
    private String itemDescription;
    private Long itemUsed;
    private Long itemSellerId;
    private Double itemMaxPrice;
    private Double itemMinPrice;
    private String itemOnShelfTime;
    private Long itemAucLength;
    private String itemAddTime;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemPicture1() {
        return itemPicture1;
    }

    public void setItemPicture1(String itemPicture1) {
        this.itemPicture1 = itemPicture1;
    }

    public String getItemPicture2() {
        return itemPicture2;
    }

    public void setItemPicture2(String itemPicture2) {
        this.itemPicture2 = itemPicture2;
    }

    public String getItemPicture3() {
        return itemPicture3;
    }

    public void setItemPicture3(String itemPicture3) {
        this.itemPicture3 = itemPicture3;
    }

    public String getItemPicture4() {
        return itemPicture4;
    }

    public void setItemPicture4(String itemPicture4) {
        this.itemPicture4 = itemPicture4;
    }

    public String getItemPicture5() {
        return itemPicture5;
    }

    public void setItemPicture5(String itemPicture5) {
        this.itemPicture5 = itemPicture5;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Long getItemUsed() {
        return itemUsed;
    }

    public void setItemUsed(Long itemUsed) {
        this.itemUsed = itemUsed;
    }

    public Long getItemSellerId() {
        return itemSellerId;
    }

    public void setItemSellerId(Long itemSellerId) {
        this.itemSellerId = itemSellerId;
    }

    public Double getItemMaxPrice() {
        return itemMaxPrice;
    }

    public void setItemMaxPrice(Double itemMaxPrice) {
        this.itemMaxPrice = itemMaxPrice;
    }

    public Double getItemMinPrice() {
        return itemMinPrice;
    }

    public void setItemMinPrice(Double itemMinPrice) {
        this.itemMinPrice = itemMinPrice;
    }

    public String getItemOnShelfTime() {
        return itemOnShelfTime;
    }

    public void setItemOnShelfTime(String itemOnShelfTime) {
        this.itemOnShelfTime = itemOnShelfTime;
    }

    public Long getItemAucLength() {
        return itemAucLength;
    }

    public void setItemAucLength(Long itemAucLength) {
        this.itemAucLength = itemAucLength;
    }

    public String getItemAddTime() {
        return itemAddTime;
    }

    public void setItemAddTime(String itemAddTime) {
        this.itemAddTime = itemAddTime;
    }

    @Override
    public void setState(Entity voin) throws Exception {
        PersistanceUtil.setEBState(this, voin);
    }

    @Override
    public Entity getState() throws Exception {
        ItemVO vo = new ItemVO();
        PersistanceUtil.setVOState(this, vo);
        return vo;
    }
}
