// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UnicomSignConfirmRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TmsOrder")
    public java.util.List<UnicomSignConfirmRequestTmsOrder> tmsOrder;

    public static UnicomSignConfirmRequest build(java.util.Map<String, ?> map) throws Exception {
        UnicomSignConfirmRequest self = new UnicomSignConfirmRequest();
        return TeaModel.build(map, self);
    }

    public UnicomSignConfirmRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UnicomSignConfirmRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UnicomSignConfirmRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UnicomSignConfirmRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UnicomSignConfirmRequest setTmsOrder(java.util.List<UnicomSignConfirmRequestTmsOrder> tmsOrder) {
        this.tmsOrder = tmsOrder;
        return this;
    }
    public java.util.List<UnicomSignConfirmRequestTmsOrder> getTmsOrder() {
        return this.tmsOrder;
    }

    public static class UnicomSignConfirmRequestTmsOrder extends TeaModel {
        @NameInMap("SigningTime")
        public String signingTime;

        @NameInMap("TradeId")
        public String tradeId;

        @NameInMap("TmsOrderCode")
        public String tmsOrderCode;

        @NameInMap("TmsCode")
        public String tmsCode;

        public static UnicomSignConfirmRequestTmsOrder build(java.util.Map<String, ?> map) throws Exception {
            UnicomSignConfirmRequestTmsOrder self = new UnicomSignConfirmRequestTmsOrder();
            return TeaModel.build(map, self);
        }

        public UnicomSignConfirmRequestTmsOrder setSigningTime(String signingTime) {
            this.signingTime = signingTime;
            return this;
        }
        public String getSigningTime() {
            return this.signingTime;
        }

        public UnicomSignConfirmRequestTmsOrder setTradeId(String tradeId) {
            this.tradeId = tradeId;
            return this;
        }
        public String getTradeId() {
            return this.tradeId;
        }

        public UnicomSignConfirmRequestTmsOrder setTmsOrderCode(String tmsOrderCode) {
            this.tmsOrderCode = tmsOrderCode;
            return this;
        }
        public String getTmsOrderCode() {
            return this.tmsOrderCode;
        }

        public UnicomSignConfirmRequestTmsOrder setTmsCode(String tmsCode) {
            this.tmsCode = tmsCode;
            return this;
        }
        public String getTmsCode() {
            return this.tmsCode;
        }

    }

}
