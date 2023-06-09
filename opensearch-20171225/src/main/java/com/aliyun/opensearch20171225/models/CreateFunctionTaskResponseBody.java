// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateFunctionTaskResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpCode")
    public Long httpCode;

    /**
     * <p>The time consumed for the request, in milliseconds.</p>
     */
    @NameInMap("Latency")
    public Long latency;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the request.</p>
     */
    @NameInMap("Status")
    public String status;

    public static CreateFunctionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFunctionTaskResponseBody self = new CreateFunctionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFunctionTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateFunctionTaskResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public CreateFunctionTaskResponseBody setLatency(Long latency) {
        this.latency = latency;
        return this;
    }
    public Long getLatency() {
        return this.latency;
    }

    public CreateFunctionTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateFunctionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFunctionTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
