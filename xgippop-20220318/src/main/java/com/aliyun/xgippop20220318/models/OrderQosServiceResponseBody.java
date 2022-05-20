// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220318.models;

import com.aliyun.tea.*;

public class OrderQosServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("CustomerQosOrderId")
    public String customerQosOrderId;

    @NameInMap("CustomerQosRequestId")
    public String customerQosRequestId;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static OrderQosServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OrderQosServiceResponseBody self = new OrderQosServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OrderQosServiceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public OrderQosServiceResponseBody setCustomerQosOrderId(String customerQosOrderId) {
        this.customerQosOrderId = customerQosOrderId;
        return this;
    }
    public String getCustomerQosOrderId() {
        return this.customerQosOrderId;
    }

    public OrderQosServiceResponseBody setCustomerQosRequestId(String customerQosRequestId) {
        this.customerQosRequestId = customerQosRequestId;
        return this;
    }
    public String getCustomerQosRequestId() {
        return this.customerQosRequestId;
    }

    public OrderQosServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OrderQosServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
