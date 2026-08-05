// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class DeleteFunctionInstanceResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter is displayed only when an exception occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.common.RamActionPermissionDeny</p>
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
     * <p>The request latency, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("Latency")
    public Long latency;

    /**
     * <p>The error message. This parameter is displayed only when an exception occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>Managed id is empty</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>786CC01F-0F1D-5FB5-8BFF-B0F3DB289772</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The request status.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
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
