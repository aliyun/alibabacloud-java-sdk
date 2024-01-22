// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateAppSecurityGroupResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the security group of the application is successfully updated. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: indicates that the request was successful.</p>
     * <p>*   **3xx**: indicates that the request was redirected.</p>
     * <p>*   **4xx**: indicates that the request was invalid.</p>
     * <p>*   **5xx**: indicates that a server error occurred.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The ID of the trace. It can be used to query details of a request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>*   If the request is successful, **success** is returned.</p>
     * <p>*   An error code is returned when the request fails.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The error code.</p>
     * <br>
     * <p>*   If the request is successful, this parameter is not returned.****</p>
     * <p>*   This parameter is returned only if the request failed.**** For more information, see the "**Error codes**" section in this topic.</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static UpdateAppSecurityGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppSecurityGroupResponseBody self = new UpdateAppSecurityGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAppSecurityGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateAppSecurityGroupResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateAppSecurityGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateAppSecurityGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAppSecurityGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateAppSecurityGroupResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
