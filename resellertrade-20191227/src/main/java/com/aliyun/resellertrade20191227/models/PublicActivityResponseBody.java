// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class PublicActivityResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ContextMap")
    public java.util.Map<String, ?> contextMap;

    @NameInMap("Data")
    public java.util.List<Long> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PublicActivityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublicActivityResponseBody self = new PublicActivityResponseBody();
        return TeaModel.build(map, self);
    }

    public PublicActivityResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PublicActivityResponseBody setContextMap(java.util.Map<String, ?> contextMap) {
        this.contextMap = contextMap;
        return this;
    }
    public java.util.Map<String, ?> getContextMap() {
        return this.contextMap;
    }

    public PublicActivityResponseBody setData(java.util.List<Long> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Long> getData() {
        return this.data;
    }

    public PublicActivityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PublicActivityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PublicActivityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
