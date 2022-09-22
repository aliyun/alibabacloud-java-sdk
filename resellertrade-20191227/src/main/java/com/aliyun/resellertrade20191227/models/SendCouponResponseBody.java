// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class SendCouponResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ContextMap")
    public java.util.Map<String, ?> contextMap;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public java.util.List<SendCouponResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static SendCouponResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendCouponResponseBody self = new SendCouponResponseBody();
        return TeaModel.build(map, self);
    }

    public SendCouponResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendCouponResponseBody setContextMap(java.util.Map<String, ?> contextMap) {
        this.contextMap = contextMap;
        return this;
    }
    public java.util.Map<String, ?> getContextMap() {
        return this.contextMap;
    }

    public SendCouponResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public SendCouponResponseBody setData(java.util.List<SendCouponResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SendCouponResponseBodyData> getData() {
        return this.data;
    }

    public SendCouponResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendCouponResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendCouponResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SendCouponResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class SendCouponResponseBodyData extends TeaModel {
        @NameInMap("Amount")
        public Double amount;

        @NameInMap("Uid")
        public Long uid;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("YouhuiId")
        public Long youhuiId;

        public static SendCouponResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendCouponResponseBodyData self = new SendCouponResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendCouponResponseBodyData setAmount(Double amount) {
            this.amount = amount;
            return this;
        }
        public Double getAmount() {
            return this.amount;
        }

        public SendCouponResponseBodyData setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

        public SendCouponResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public SendCouponResponseBodyData setYouhuiId(Long youhuiId) {
            this.youhuiId = youhuiId;
            return this;
        }
        public Long getYouhuiId() {
            return this.youhuiId;
        }

    }

}
