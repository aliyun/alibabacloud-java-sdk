// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetCurrentConcurrencyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CurrentConcurrency")
    public Integer currentConcurrency;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MaxConcurrentConversation")
    public Integer maxConcurrentConversation;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCurrentConcurrencyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCurrentConcurrencyResponseBody self = new GetCurrentConcurrencyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCurrentConcurrencyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCurrentConcurrencyResponseBody setCurrentConcurrency(Integer currentConcurrency) {
        this.currentConcurrency = currentConcurrency;
        return this;
    }
    public Integer getCurrentConcurrency() {
        return this.currentConcurrency;
    }

    public GetCurrentConcurrencyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetCurrentConcurrencyResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetCurrentConcurrencyResponseBody setMaxConcurrentConversation(Integer maxConcurrentConversation) {
        this.maxConcurrentConversation = maxConcurrentConversation;
        return this;
    }
    public Integer getMaxConcurrentConversation() {
        return this.maxConcurrentConversation;
    }

    public GetCurrentConcurrencyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCurrentConcurrencyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCurrentConcurrencyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
