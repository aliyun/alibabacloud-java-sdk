// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateNamespaceSlsConfigsResponseBody extends TeaModel {
    /**
     * <p>The API status code or POP error code. Valid values: 2xx: success. 3xx: redirection. 4xx: request error. 5xx: server error.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li>Successful request: The <strong>ErrorCode</strong> field is not returned.</li>
     * <li>Failed request: The <strong>ErrorCode</strong> field is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InvalidNamespaceId.NotFound</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the SLS configuration for the namespace was updated successfully. Valid values:</p>
     * <ul>
     * <li>true: The configuration was updated successfully.</li>
     * <li>false: The configuration failed to be updated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID used to precisely query call information.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    /**
     * <p>Id of the request</p>
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
