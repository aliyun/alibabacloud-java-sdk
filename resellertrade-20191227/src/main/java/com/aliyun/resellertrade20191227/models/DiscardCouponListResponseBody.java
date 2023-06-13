// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class DiscardCouponListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ContextMap")
    public java.util.Map<String, ?> contextMap;

    /**
     * <p>result data</p>
     */
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DiscardCouponListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DiscardCouponListResponseBody self = new DiscardCouponListResponseBody();
        return TeaModel.build(map, self);
    }

    public DiscardCouponListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DiscardCouponListResponseBody setContextMap(java.util.Map<String, ?> contextMap) {
        this.contextMap = contextMap;
        return this;
    }
    public java.util.Map<String, ?> getContextMap() {
        return this.contextMap;
    }

    public DiscardCouponListResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DiscardCouponListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DiscardCouponListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DiscardCouponListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
