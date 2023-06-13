// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class CreateCouponTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ContextMap")
    public java.util.Map<String, ?> contextMap;

    /**
     * <p>result data</p>
     */
    @NameInMap("Data")
    public Long data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateCouponTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCouponTemplateResponseBody self = new CreateCouponTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCouponTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateCouponTemplateResponseBody setContextMap(java.util.Map<String, ?> contextMap) {
        this.contextMap = contextMap;
        return this;
    }
    public java.util.Map<String, ?> getContextMap() {
        return this.contextMap;
    }

    public CreateCouponTemplateResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public CreateCouponTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateCouponTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCouponTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
