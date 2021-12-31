// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetFunctionDefaultInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    // 功能名称
    @NameInMap("FunctionName")
    public String functionName;

    @NameInMap("HttpCode")
    public Long httpCode;

    // 实例名称
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("Latency")
    public Long latency;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetFunctionDefaultInstanceResponseBodyResult result;

    @NameInMap("Status")
    public String status;

    public static GetFunctionDefaultInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionDefaultInstanceResponseBody self = new GetFunctionDefaultInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFunctionDefaultInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFunctionDefaultInstanceResponseBody setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public GetFunctionDefaultInstanceResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public GetFunctionDefaultInstanceResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public GetFunctionDefaultInstanceResponseBody setLatency(Long latency) {
        this.latency = latency;
        return this;
    }
    public Long getLatency() {
        return this.latency;
    }

    public GetFunctionDefaultInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFunctionDefaultInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFunctionDefaultInstanceResponseBody setResult(GetFunctionDefaultInstanceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetFunctionDefaultInstanceResponseBodyResult getResult() {
        return this.result;
    }

    public GetFunctionDefaultInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetFunctionDefaultInstanceResponseBodyResult extends TeaModel {
        @NameInMap("InstanceName")
        public String instanceName;

        public static GetFunctionDefaultInstanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetFunctionDefaultInstanceResponseBodyResult self = new GetFunctionDefaultInstanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetFunctionDefaultInstanceResponseBodyResult setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

    }

}
