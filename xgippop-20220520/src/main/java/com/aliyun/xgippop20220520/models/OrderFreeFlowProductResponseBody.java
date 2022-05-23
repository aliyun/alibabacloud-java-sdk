// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class OrderFreeFlowProductResponseBody extends TeaModel {
    // 结果码
    @NameInMap("Code")
    public String code;

    // 结果
    @NameInMap("Data")
    public OrderFreeFlowProductResponseBodyData data;

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

    public static class OrderFreeFlowProductResponseBodyData extends TeaModel {
        // C端免流订单ID
        @NameInMap("CustomerFlowOrderId")
        public String customerFlowOrderId;

        @NameInMap("CustomerFlowRequestId")
        public String customerFlowRequestId;

        // 执行中ordering、成功success、失败fail
        @NameInMap("Status")
        public String status;

        public static OrderFreeFlowProductResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OrderFreeFlowProductResponseBodyData self = new OrderFreeFlowProductResponseBodyData();
            return TeaModel.build(map, self);
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
