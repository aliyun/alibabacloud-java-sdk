// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetFunctionDefaultInstanceResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The name of the feature.</p>
     */
    @NameInMap("FunctionName")
    public String functionName;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpCode")
    public Long httpCode;

    /**
     * <p>The name of the instance.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The default running time.</p>
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
     * <p>The result of the request.</p>
     */
    @NameInMap("Result")
    public GetFunctionDefaultInstanceResponseBodyResult result;

    /**
     * <p>The status of the request.</p>
     */
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
        /**
         * <p>The default instance name.</p>
         */
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
