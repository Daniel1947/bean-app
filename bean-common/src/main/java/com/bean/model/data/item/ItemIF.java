package com.bean.model.data.item;

/**
 * Created by Daniel on 14-8-20.
 */
public interface ItemIF {
    public Long getItemId() ;

    public void setItemId(Long itemId) ;

    public String getItemName() ;

    public void setItemName(String itemName) ;

    public String getItemPicture1() ;

    public void setItemPicture1(String itemPicture1) ;

    public String getItemPicture2() ;

    public void setItemPicture2(String itemPicture2) ;

    public String getItemPicture3() ;

    public void setItemPicture3(String itemPicture3) ;

    public String getItemPicture4() ;

    public void setItemPicture4(String itemPicture4) ;

    public String getItemPicture5() ;

    public void setItemPicture5(String itemPicture5) ;

    public String getItemDescription() ;

    public void setItemDescription(String itemDescription) ;

    public Long getItemUsed() ;

    public void setItemUsed(Long itemUsed) ;

    public Long getItemSellerId() ;

    public void setItemSellerId(Long itemSellerId) ;

    public Double getItemMaxPrice() ;

    public void setItemMaxPrice(Double itemMaxPrice) ;

    public Double getItemMinPrice() ;

    public void setItemMinPrice(Double itemMinPrice) ;

    public String getItemOnShelfTime() ;

    public void setItemOnShelfTime(String itemOnShelfTime) ;

    public Long getItemAucLength() ;

    public void setItemAucLength(Long itemAucLength) ;

    public String getItemAddTime() ;

    public void setItemAddTime(String itemAddTime) ;
}
