// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UnicomOrderConfirmRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerUserId")
    public String ownerUserId;

    @NameInMap("TradeId")
    public String tradeId;

    @NameInMap("TmsCode")
    public String tmsCode;

    @NameInMap("TmsOrderCode")
    public String tmsOrderCode;

    @NameInMap("OrderPostFee")
    public Long orderPostFee;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("OrderItem")
    public java.util.List<UnicomOrderConfirmRequestOrderItem> orderItem;

    public static UnicomOrderConfirmRequest build(java.util.Map<String, ?> map) throws Exception {
        UnicomOrderConfirmRequest self = new UnicomOrderConfirmRequest();
        return TeaModel.build(map, self);
    }

    public UnicomOrderConfirmRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UnicomOrderConfirmRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UnicomOrderConfirmRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UnicomOrderConfirmRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UnicomOrderConfirmRequest setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId;
        return this;
    }
    public String getOwnerUserId() {
        return this.ownerUserId;
    }

    public UnicomOrderConfirmRequest setTradeId(String tradeId) {
        this.tradeId = tradeId;
        return this;
    }
    public String getTradeId() {
        return this.tradeId;
    }

    public UnicomOrderConfirmRequest setTmsCode(String tmsCode) {
        this.tmsCode = tmsCode;
        return this;
    }
    public String getTmsCode() {
        return this.tmsCode;
    }

    public UnicomOrderConfirmRequest setTmsOrderCode(String tmsOrderCode) {
        this.tmsOrderCode = tmsOrderCode;
        return this;
    }
    public String getTmsOrderCode() {
        return this.tmsOrderCode;
    }

    public UnicomOrderConfirmRequest setOrderPostFee(Long orderPostFee) {
        this.orderPostFee = orderPostFee;
        return this;
    }
    public Long getOrderPostFee() {
        return this.orderPostFee;
    }

    public UnicomOrderConfirmRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UnicomOrderConfirmRequest setOrderItem(java.util.List<UnicomOrderConfirmRequestOrderItem> orderItem) {
        this.orderItem = orderItem;
        return this;
    }
    public java.util.List<UnicomOrderConfirmRequestOrderItem> getOrderItem() {
        return this.orderItem;
    }

    public static class UnicomOrderConfirmRequestOrderItem extends TeaModel {
        @NameInMap("ItemAmount")
        public String itemAmount;

        @NameInMap("ScItemName")
        public String scItemName;

        @NameInMap("OrderItemId")
        public String orderItemId;

        @NameInMap("TradeItemId")
        public String tradeItemId;

        @NameInMap("SnList")
        public java.util.List<String> snList;

        @NameInMap("TradeId")
        public String tradeId;

        @NameInMap("ItemQuantity")
        public Integer itemQuantity;

        @NameInMap("ScItemCode")
        public String scItemCode;

        public static UnicomOrderConfirmRequestOrderItem build(java.util.Map<String, ?> map) throws Exception {
            UnicomOrderConfirmRequestOrderItem self = new UnicomOrderConfirmRequestOrderItem();
            return TeaModel.build(map, self);
        }

        public UnicomOrderConfirmRequestOrderItem setItemAmount(String itemAmount) {
            this.itemAmount = itemAmount;
            return this;
        }
        public String getItemAmount() {
            return this.itemAmount;
        }

        public UnicomOrderConfirmRequestOrderItem setScItemName(String scItemName) {
            this.scItemName = scItemName;
            return this;
        }
        public String getScItemName() {
            return this.scItemName;
        }

        public UnicomOrderConfirmRequestOrderItem setOrderItemId(String orderItemId) {
            this.orderItemId = orderItemId;
            return this;
        }
        public String getOrderItemId() {
            return this.orderItemId;
        }

        public UnicomOrderConfirmRequestOrderItem setTradeItemId(String tradeItemId) {
            this.tradeItemId = tradeItemId;
            return this;
        }
        public String getTradeItemId() {
            return this.tradeItemId;
        }

        public UnicomOrderConfirmRequestOrderItem setSnList(java.util.List<String> snList) {
            this.snList = snList;
            return this;
        }
        public java.util.List<String> getSnList() {
            return this.snList;
        }

        public UnicomOrderConfirmRequestOrderItem setTradeId(String tradeId) {
            this.tradeId = tradeId;
            return this;
        }
        public String getTradeId() {
            return this.tradeId;
        }

        public UnicomOrderConfirmRequestOrderItem setItemQuantity(Integer itemQuantity) {
            this.itemQuantity = itemQuantity;
            return this;
        }
        public Integer getItemQuantity() {
            return this.itemQuantity;
        }

        public UnicomOrderConfirmRequestOrderItem setScItemCode(String scItemCode) {
            this.scItemCode = scItemCode;
            return this;
        }
        public String getScItemCode() {
            return this.scItemCode;
        }

    }

}
