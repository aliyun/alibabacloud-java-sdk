// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateApplicationVswitchesResponseBody extends TeaModel {
    /**
     * <p>The API status code or POP error code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: success</li>
     * <li><strong>3xx</strong>: redirection</li>
     * <li><strong>4xx</strong>: request error</li>
     * <li><strong>5xx</strong>: server error</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li>If the request is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
     * <li>If the request fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter.NotEmpty</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information.</p>
     * <ul>
     * <li>If the request is successful, <strong>success</strong> is returned.</li>
     * <li>If an exception occurs, a specific error code is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the application list is retrieved. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The application list is retrieved.</li>
     * <li><strong>false</strong>: The application list fails to be retrieved.</li>
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

    public static UpdateApplicationVswitchesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationVswitchesResponseBody self = new UpdateApplicationVswitchesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationVswitchesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateApplicationVswitchesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateApplicationVswitchesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateApplicationVswitchesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateApplicationVswitchesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateApplicationVswitchesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
