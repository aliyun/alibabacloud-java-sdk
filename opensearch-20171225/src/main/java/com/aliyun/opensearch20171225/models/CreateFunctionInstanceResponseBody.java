// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateFunctionInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpCode")
    public Long httpCode;

    @NameInMap("Latency")
    public Long latency;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static CreateFunctionInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFunctionInstanceResponseBody self = new CreateFunctionInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFunctionInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateFunctionInstanceResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public CreateFunctionInstanceResponseBody setLatency(Long latency) {
        this.latency = latency;
        return this;
    }
    public Long getLatency() {
        return this.latency;
    }

    public CreateFunctionInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateFunctionInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFunctionInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
