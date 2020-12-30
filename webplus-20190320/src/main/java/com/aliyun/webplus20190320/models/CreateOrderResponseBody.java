// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class CreateOrderResponseBody extends TeaModel {
    @NameInMap("OrderDetail")
    public CreateOrderResponseBodyOrderDetail orderDetail;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static CreateOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderResponseBody self = new CreateOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrderResponseBody setOrderDetail(CreateOrderResponseBodyOrderDetail orderDetail) {
        this.orderDetail = orderDetail;
        return this;
    }
    public CreateOrderResponseBodyOrderDetail getOrderDetail() {
        return this.orderDetail;
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

    public CreateOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class CreateOrderResponseBodyOrderDetail extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        public static CreateOrderResponseBodyOrderDetail build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderResponseBodyOrderDetail self = new CreateOrderResponseBodyOrderDetail();
            return TeaModel.build(map, self);
        }

        public CreateOrderResponseBodyOrderDetail setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public CreateOrderResponseBodyOrderDetail setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CreateOrderResponseBodyOrderDetail setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public CreateOrderResponseBodyOrderDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateOrderResponseBodyOrderDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
