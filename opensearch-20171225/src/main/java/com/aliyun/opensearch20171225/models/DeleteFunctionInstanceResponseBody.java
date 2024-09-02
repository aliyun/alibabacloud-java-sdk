// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DeleteFunctionInstanceResponseBody extends TeaModel {
    /**
     * <p>The error code. If no error occurs, this parameter is left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;Instance.NotExist&quot;</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpCode")
    public Long httpCode;

    /**
     * <p>The time consumed for the request, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Latency")
    public Long latency;

    /**
     * <p>The error message. If no error occurs, this parameter is left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;instance not exist.&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;1081EB05-473C-5BF4-95BE-6D7CAD5E2213&quot;</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the request. Valid values:</p>
     * <ul>
     * <li>OK: The request is successful.</li>
     * <li>FAIL: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;OK&quot;</p>
     */
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
