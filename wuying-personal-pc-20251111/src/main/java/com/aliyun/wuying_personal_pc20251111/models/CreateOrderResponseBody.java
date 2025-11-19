// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class CreateOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateOrderResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TraceId")
    public String traceId;

    public static CreateOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderResponseBody self = new CreateOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateOrderResponseBody setData(CreateOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateOrderResponseBodyData getData() {
        return this.data;
    }

    public CreateOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOrderResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CreateOrderResponseBodyDataOrderDetailList extends TeaModel {
        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        @NameInMap("OrderId")
        public Long orderId;

        public static CreateOrderResponseBodyDataOrderDetailList build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderResponseBodyDataOrderDetailList self = new CreateOrderResponseBodyDataOrderDetailList();
            return TeaModel.build(map, self);
        }

        public CreateOrderResponseBodyDataOrderDetailList setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public CreateOrderResponseBodyDataOrderDetailList setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

    public static class CreateOrderResponseBodyData extends TeaModel {
        @NameInMap("OrderDetailList")
        public java.util.List<CreateOrderResponseBodyDataOrderDetailList> orderDetailList;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("PayLink")
        public String payLink;

        @NameInMap("ResourceId")
        public String resourceId;

        public static CreateOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderResponseBodyData self = new CreateOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateOrderResponseBodyData setOrderDetailList(java.util.List<CreateOrderResponseBodyDataOrderDetailList> orderDetailList) {
            this.orderDetailList = orderDetailList;
            return this;
        }
        public java.util.List<CreateOrderResponseBodyDataOrderDetailList> getOrderDetailList() {
            return this.orderDetailList;
        }

        public CreateOrderResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public CreateOrderResponseBodyData setPayLink(String payLink) {
            this.payLink = payLink;
            return this;
        }
        public String getPayLink() {
            return this.payLink;
        }

        public CreateOrderResponseBodyData setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

}
