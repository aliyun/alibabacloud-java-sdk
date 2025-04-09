// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetCurrentConcurrencyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("CurrentConcurrency")
    public Integer currentConcurrency;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>12f3dd08-0c55-44ce-9b64-e69d35ed3a76</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MaxConcurrentConversation")
    public Integer maxConcurrentConversation;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
