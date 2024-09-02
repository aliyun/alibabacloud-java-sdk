// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateFunctionResourceResponseBody extends TeaModel {
    /**
     * <p>The error code. If no error occurs, this parameter is left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidRequest</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpCode")
    public Long httpCode;

    /**
     * <p>The time consumed for the request. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Latency")
    public Double latency;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7E375703-5B12-5466-8B48-C4D01AE1291A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateFunctionResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFunctionResourceResponseBody self = new UpdateFunctionResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFunctionResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateFunctionResourceResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public UpdateFunctionResourceResponseBody setLatency(Double latency) {
        this.latency = latency;
        return this;
    }
    public Double getLatency() {
        return this.latency;
    }

    public UpdateFunctionResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateFunctionResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateFunctionResourceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
