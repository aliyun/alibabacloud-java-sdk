// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetOrderFreeFlowProductStatusResponseBody extends TeaModel {
    // 结果码
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetOrderFreeFlowProductStatusResponseBodyData data;

    // 结果描述
    @NameInMap("Message")
    public String message;

    // 请求链路ID，如POP请求进来的requestId，返回时原样返回
    @NameInMap("RequestId")
    public String requestId;

    // 服务端处理耗时，ms
    @NameInMap("Rt")
    public Long rt;

    // 是否成功
    @NameInMap("Success")
    public Boolean success;

    public static GetOrderFreeFlowProductStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOrderFreeFlowProductStatusResponseBody self = new GetOrderFreeFlowProductStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOrderFreeFlowProductStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOrderFreeFlowProductStatusResponseBody setData(GetOrderFreeFlowProductStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOrderFreeFlowProductStatusResponseBodyData getData() {
        return this.data;
    }

    public GetOrderFreeFlowProductStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOrderFreeFlowProductStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOrderFreeFlowProductStatusResponseBody setRt(Long rt) {
        this.rt = rt;
        return this;
    }
    public Long getRt() {
        return this.rt;
    }

    public GetOrderFreeFlowProductStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOrderFreeFlowProductStatusResponseBodyData extends TeaModel {
        // C端免流订单ID
        @NameInMap("CustomerFlowOrderId")
        public String customerFlowOrderId;

        @NameInMap("CustomerFlowRequestId")
        public String customerFlowRequestId;

        // status为fail时，描述fail的具体原因
        @NameInMap("Error")
        public String error;

        // 执行中ordering、成功success、失败fail
        @NameInMap("Status")
        public String status;

        public static GetOrderFreeFlowProductStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOrderFreeFlowProductStatusResponseBodyData self = new GetOrderFreeFlowProductStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOrderFreeFlowProductStatusResponseBodyData setCustomerFlowOrderId(String customerFlowOrderId) {
            this.customerFlowOrderId = customerFlowOrderId;
            return this;
        }
        public String getCustomerFlowOrderId() {
            return this.customerFlowOrderId;
        }

        public GetOrderFreeFlowProductStatusResponseBodyData setCustomerFlowRequestId(String customerFlowRequestId) {
            this.customerFlowRequestId = customerFlowRequestId;
            return this;
        }
        public String getCustomerFlowRequestId() {
            return this.customerFlowRequestId;
        }

        public GetOrderFreeFlowProductStatusResponseBodyData setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public GetOrderFreeFlowProductStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
