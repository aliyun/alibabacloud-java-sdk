// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class GetResellerPayOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetResellerPayOrderResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetResellerPayOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResellerPayOrderResponseBody self = new GetResellerPayOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResellerPayOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetResellerPayOrderResponseBody setData(GetResellerPayOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetResellerPayOrderResponseBodyData getData() {
        return this.data;
    }

    public GetResellerPayOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetResellerPayOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResellerPayOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetResellerPayOrderResponseBodyData extends TeaModel {
        @NameInMap("BuyerId")
        public String buyerId;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("OrderStatus")
        public String orderStatus;

        @NameInMap("PayAmount")
        public String payAmount;

        public static GetResellerPayOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetResellerPayOrderResponseBodyData self = new GetResellerPayOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetResellerPayOrderResponseBodyData setBuyerId(String buyerId) {
            this.buyerId = buyerId;
            return this;
        }
        public String getBuyerId() {
            return this.buyerId;
        }

        public GetResellerPayOrderResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public GetResellerPayOrderResponseBodyData setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public String getOrderStatus() {
            return this.orderStatus;
        }

        public GetResellerPayOrderResponseBodyData setPayAmount(String payAmount) {
            this.payAmount = payAmount;
            return this;
        }
        public String getPayAmount() {
            return this.payAmount;
        }

    }

}
