// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ResumeFunctionInstanceResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>not found</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Long httpCode;

    /**
     * <p>The time consumed, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>145.411</p>
     */
    @NameInMap("latency")
    public Long latency;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;xx not found&quot;</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5950143C-B8F0-5758-A08A-66F302FD587F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The request status.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("status")
    public String status;

    public static ResumeFunctionInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResumeFunctionInstanceResponseBody self = new ResumeFunctionInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ResumeFunctionInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ResumeFunctionInstanceResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public ResumeFunctionInstanceResponseBody setLatency(Long latency) {
        this.latency = latency;
        return this;
    }
    public Long getLatency() {
        return this.latency;
    }

    public ResumeFunctionInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ResumeFunctionInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResumeFunctionInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
