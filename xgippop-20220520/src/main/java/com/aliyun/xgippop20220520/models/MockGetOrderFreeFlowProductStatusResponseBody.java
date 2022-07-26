// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class MockGetOrderFreeFlowProductStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public MockGetOrderFreeFlowProductStatusResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rt")
    public Long rt;

    @NameInMap("Success")
    public Boolean success;

    public static MockGetOrderFreeFlowProductStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MockGetOrderFreeFlowProductStatusResponseBody self = new MockGetOrderFreeFlowProductStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public MockGetOrderFreeFlowProductStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MockGetOrderFreeFlowProductStatusResponseBody setData(MockGetOrderFreeFlowProductStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MockGetOrderFreeFlowProductStatusResponseBodyData getData() {
        return this.data;
    }

    public MockGetOrderFreeFlowProductStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MockGetOrderFreeFlowProductStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MockGetOrderFreeFlowProductStatusResponseBody setRt(Long rt) {
        this.rt = rt;
        return this;
    }
    public Long getRt() {
        return this.rt;
    }

    public MockGetOrderFreeFlowProductStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class MockGetOrderFreeFlowProductStatusResponseBodyData extends TeaModel {
        @NameInMap("CustomerFlowOrderId")
        public String customerFlowOrderId;

        @NameInMap("CustomerFlowRequestId")
        public String customerFlowRequestId;

        @NameInMap("Error")
        public String error;

        @NameInMap("Status")
        public String status;

        public static MockGetOrderFreeFlowProductStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MockGetOrderFreeFlowProductStatusResponseBodyData self = new MockGetOrderFreeFlowProductStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MockGetOrderFreeFlowProductStatusResponseBodyData setCustomerFlowOrderId(String customerFlowOrderId) {
            this.customerFlowOrderId = customerFlowOrderId;
            return this;
        }
        public String getCustomerFlowOrderId() {
            return this.customerFlowOrderId;
        }

        public MockGetOrderFreeFlowProductStatusResponseBodyData setCustomerFlowRequestId(String customerFlowRequestId) {
            this.customerFlowRequestId = customerFlowRequestId;
            return this;
        }
        public String getCustomerFlowRequestId() {
            return this.customerFlowRequestId;
        }

        public MockGetOrderFreeFlowProductStatusResponseBodyData setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public MockGetOrderFreeFlowProductStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
