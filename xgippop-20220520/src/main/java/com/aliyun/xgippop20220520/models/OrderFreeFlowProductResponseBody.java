// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class OrderFreeFlowProductResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public OrderFreeFlowProductResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rt")
    public Long rt;

    @NameInMap("Success")
    public Boolean success;

    public static OrderFreeFlowProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OrderFreeFlowProductResponseBody self = new OrderFreeFlowProductResponseBody();
        return TeaModel.build(map, self);
    }

    public OrderFreeFlowProductResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OrderFreeFlowProductResponseBody setData(OrderFreeFlowProductResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OrderFreeFlowProductResponseBodyData getData() {
        return this.data;
    }

    public OrderFreeFlowProductResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OrderFreeFlowProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OrderFreeFlowProductResponseBody setRt(Long rt) {
        this.rt = rt;
        return this;
    }
    public Long getRt() {
        return this.rt;
    }

    public OrderFreeFlowProductResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class MockOrderFreeFlowProductResponseBodyData extends TeaModel {
        @NameInMap("BizCode")
        public String bizCode;

        @NameInMap("CustomerFlowOrderId")
        public String customerFlowOrderId;

        @NameInMap("CustomerFlowRequestId")
        public String customerFlowRequestId;

        @NameInMap("Status")
        public String status;

        public static MockOrderFreeFlowProductResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MockOrderFreeFlowProductResponseBodyData self = new MockOrderFreeFlowProductResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MockOrderFreeFlowProductResponseBodyData setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public MockOrderFreeFlowProductResponseBodyData setCustomerFlowOrderId(String customerFlowOrderId) {
            this.customerFlowOrderId = customerFlowOrderId;
            return this;
        }
        public String getCustomerFlowOrderId() {
            return this.customerFlowOrderId;
        }

        public MockOrderFreeFlowProductResponseBodyData setCustomerFlowRequestId(String customerFlowRequestId) {
            this.customerFlowRequestId = customerFlowRequestId;
            return this;
        }
        public String getCustomerFlowRequestId() {
            return this.customerFlowRequestId;
        }

        public MockOrderFreeFlowProductResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class OrderFreeFlowProductResponseBodyData extends TeaModel {
        @NameInMap("BizCode")
        public String bizCode;

        @NameInMap("CustomerFlowOrderId")
        public String customerFlowOrderId;

        @NameInMap("CustomerFlowRequestId")
        public String customerFlowRequestId;

        @NameInMap("Status")
        public String status;

        public static OrderFreeFlowProductResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OrderFreeFlowProductResponseBodyData self = new OrderFreeFlowProductResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OrderFreeFlowProductResponseBodyData setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public OrderFreeFlowProductResponseBodyData setCustomerFlowOrderId(String customerFlowOrderId) {
            this.customerFlowOrderId = customerFlowOrderId;
            return this;
        }
        public String getCustomerFlowOrderId() {
            return this.customerFlowOrderId;
        }

        public OrderFreeFlowProductResponseBodyData setCustomerFlowRequestId(String customerFlowRequestId) {
            this.customerFlowRequestId = customerFlowRequestId;
            return this;
        }
        public String getCustomerFlowRequestId() {
            return this.customerFlowRequestId;
        }

        public OrderFreeFlowProductResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
