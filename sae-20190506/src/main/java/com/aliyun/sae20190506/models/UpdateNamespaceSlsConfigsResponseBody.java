// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateNamespaceSlsConfigsResponseBody extends TeaModel {
    /**
     * <p>The API status code or POP error code. Valid values: 2xx (success), 3xx (redirect), 4xx (client error), 5xx (server error).</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li><p>If the request is successful, the response does not include the <code>ErrorCode</code> parameter.</p>
     * </li>
     * <li><p>If the request fails, the response includes the <code>ErrorCode</code> parameter. For more information, see the <strong>Error codes</strong> section of this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Additional information.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the namespace\&quot;s SLS configuration was successfully updated. A value of <code>true</code> indicates success, while <code>false</code> indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID for the request. You can use this ID to query the details of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AD0286B2-F4A4-5D43-9329-97DEF1019F06</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateNamespaceSlsConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNamespaceSlsConfigsResponseBody self = new UpdateNamespaceSlsConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNamespaceSlsConfigsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateNamespaceSlsConfigsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateNamespaceSlsConfigsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateNamespaceSlsConfigsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateNamespaceSlsConfigsResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public UpdateNamespaceSlsConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
