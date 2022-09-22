// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class SendCouponRequest extends TeaModel {
    @NameInMap("Bid")
    public Long bid;

    @NameInMap("FromApp")
    public String fromApp;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SellerId")
    public Long sellerId;

    @NameInMap("TemplateId")
    public Long templateId;

    @NameInMap("UserAmountModelList")
    public java.util.List<SendCouponRequestUserAmountModelList> userAmountModelList;

    public static SendCouponRequest build(java.util.Map<String, ?> map) throws Exception {
        SendCouponRequest self = new SendCouponRequest();
        return TeaModel.build(map, self);
    }

    public SendCouponRequest setBid(Long bid) {
        this.bid = bid;
        return this;
    }
    public Long getBid() {
        return this.bid;
    }

    public SendCouponRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public SendCouponRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public SendCouponRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendCouponRequest setSellerId(Long sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public Long getSellerId() {
        return this.sellerId;
    }

    public SendCouponRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public SendCouponRequest setUserAmountModelList(java.util.List<SendCouponRequestUserAmountModelList> userAmountModelList) {
        this.userAmountModelList = userAmountModelList;
        return this;
    }
    public java.util.List<SendCouponRequestUserAmountModelList> getUserAmountModelList() {
        return this.userAmountModelList;
    }

    public static class SendCouponRequestUserAmountModelList extends TeaModel {
        @NameInMap("Amount")
        public Double amount;

        @NameInMap("Uid")
        public Long uid;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("YouhuiId")
        public Long youhuiId;

        public static SendCouponRequestUserAmountModelList build(java.util.Map<String, ?> map) throws Exception {
            SendCouponRequestUserAmountModelList self = new SendCouponRequestUserAmountModelList();
            return TeaModel.build(map, self);
        }

        public SendCouponRequestUserAmountModelList setAmount(Double amount) {
            this.amount = amount;
            return this;
        }
        public Double getAmount() {
            return this.amount;
        }

        public SendCouponRequestUserAmountModelList setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

        public SendCouponRequestUserAmountModelList setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public SendCouponRequestUserAmountModelList setYouhuiId(Long youhuiId) {
            this.youhuiId = youhuiId;
            return this;
        }
        public Long getYouhuiId() {
            return this.youhuiId;
        }

    }

}
