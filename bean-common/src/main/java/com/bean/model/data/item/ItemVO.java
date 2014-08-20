package com.bean.model.data.item;

import com.bean.model.Entity;
import com.bean.model.data.user.UserIF;

/**
 * Created by Daniel on 14-8-20.
 */
public class ItemVO  extends Entity implements ItemIF {

    private String itemSellerName = null;

    public String getItemSellerName() {
        return itemSellerName;
    }

    public void setItemSellerName(String sellerName) {
        this.itemSellerName = sellerName;
    }

    @Override
    public String getPrimaryKeyAsString() {
        StringBuilder sb = new StringBuilder();
        return sb.toString();
    }

    @Override
    public Long getItemId() {
        return this.getAttributeAsLong(ItemAttributes.itemId);
    }

    @Override
    public void setItemId(Long itemId) {
        this.setAttribute(ItemAttributes.itemId, itemId);
    }

    @Override
    public String getItemName() {
        return (String)this.getAttribute(ItemAttributes.itemName);
    }

    @Override
    public void setItemName(String itemName) {
        this.setAttribute(ItemAttributes.itemName, itemName);
    }

    @Override
    public String getItemPicture1() {
        return (String)this.getAttribute(ItemAttributes.itemPicture1);
    }

    @Override
    public void setItemPicture1(String itemPicture1) {
        this.setAttribute(ItemAttributes.itemPicture1, itemPicture1);
    }

    @Override
    public String getItemPicture2() {
        return (String)this.getAttribute(ItemAttributes.itemPicture2);
    }

    @Override
    public void setItemPicture2(String itemPicture2) {
        this.setAttribute(ItemAttributes.itemPicture2, itemPicture2);
    }

    @Override
    public String getItemPicture3() {
        return (String)this.getAttribute(ItemAttributes.itemPicture3);
    }

    @Override
    public void setItemPicture3(String itemPicture3) {
        this.setAttribute(ItemAttributes.itemPicture3, itemPicture3);
    }

    @Override
    public String getItemPicture4() {
        return (String)this.getAttribute(ItemAttributes.itemPicture4);
    }

    @Override
    public void setItemPicture4(String itemPicture4) {
        this.setAttribute(ItemAttributes.itemPicture4, itemPicture4);
    }

    @Override
    public String getItemPicture5() {
        return (String)this.getAttribute(ItemAttributes.itemPicture5);
    }

    @Override
    public void setItemPicture5(String itemPicture5) {
        this.setAttribute(ItemAttributes.itemPicture5, itemPicture5);
    }

    @Override
    public String getItemDescription() {
        return (String)this.getAttribute(ItemAttributes.itemDescription);
    }

    @Override
    public void setItemDescription(String itemDescription) {
        this.setAttribute(ItemAttributes.itemDescription, itemDescription);
    }

    @Override
    public Long getItemUsed() {
        return (Long)this.getAttribute(ItemAttributes.itemUsed);
    }

    @Override
    public void setItemUsed(Long itemUsed) {
        this.setAttribute(ItemAttributes.itemUsed, itemUsed);
    }

    @Override
    public Long getItemSellerId() {
        return (Long)this.getAttribute(ItemAttributes.itemSellerId);
    }

    @Override
    public void setItemSellerId(Long itemSellerId) {
        this.setAttribute(ItemAttributes.itemSellerId, itemSellerId);
    }

    @Override
    public Double getItemMaxPrice() {
        return (Double)this.getAttribute(ItemAttributes.itemMaxPrice);
    }

    @Override
    public void setItemMaxPrice(Double itemMaxPrice) {
        this.setAttribute(ItemAttributes.itemMaxPrice, itemMaxPrice);
    }

    @Override
    public Double getItemMinPrice() {
        return (Double)this.getAttribute(ItemAttributes.itemMinPrice);
    }

    @Override
    public void setItemMinPrice(Double itemMinPrice) {
        this.setAttribute(ItemAttributes.itemMinPrice, itemMinPrice);
    }

    @Override
    public String getItemOnShelfTime() {
        return (String)this.getAttribute(ItemAttributes.itemOnShelfTime);
    }

    @Override
    public void setItemOnShelfTime(String itemOnShelfTime) {
        this.setAttribute(ItemAttributes.itemOnShelfTime, itemOnShelfTime);
    }

    @Override
    public Long getItemAucLength() {
        return (Long)this.getAttribute(ItemAttributes.itemAucLength);
    }

    @Override
    public void setItemAucLength(Long itemAucLength) {
        this.setAttribute(ItemAttributes.itemAucLength, itemAucLength);
    }

    @Override
    public String getItemAddTime() {
        return (String)this.getAttribute(ItemAttributes.itemAddTime);
    }

    @Override
    public void setItemAddTime(String itemAddTime) {
        this.setAttribute(ItemAttributes.itemAddTime, itemAddTime);
    }
}
