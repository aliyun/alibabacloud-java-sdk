// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DeleteFunctionResourceResponseBody extends TeaModel {
    /**
     * <p>The error code returned. If no error occurs, this value is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
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
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A4D487A9-A456-5AA5-A9C6-B7BF2889CF74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status code. Valid values:</p>
     * <ul>
     * <li>OK</li>
     * <li>FAIL</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Status")
    public String status;

    public static DeleteFunctionResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFunctionResourceResponseBody self = new DeleteFunctionResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFunctionResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteFunctionResourceResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public DeleteFunctionResourceResponseBody setLatency(Double latency) {
        this.latency = latency;
        return this;
    }
    public Double getLatency() {
        return this.latency;
    }

    public DeleteFunctionResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteFunctionResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteFunctionResourceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
