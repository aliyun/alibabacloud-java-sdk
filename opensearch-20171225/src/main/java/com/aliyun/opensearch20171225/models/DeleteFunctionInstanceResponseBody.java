// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DeleteFunctionInstanceResponseBody extends TeaModel {
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

    public static DeleteFunctionInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFunctionInstanceResponseBody self = new DeleteFunctionInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFunctionInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteFunctionInstanceResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public DeleteFunctionInstanceResponseBody setLatency(Long latency) {
        this.latency = latency;
        return this;
    }
    public Long getLatency() {
        return this.latency;
    }

    public DeleteFunctionInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteFunctionInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteFunctionInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
