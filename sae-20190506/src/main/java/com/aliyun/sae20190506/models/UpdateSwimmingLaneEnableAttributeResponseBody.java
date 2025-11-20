// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateSwimmingLaneEnableAttributeResponseBody extends TeaModel {
    /**
     * <p>The interface status or POP error code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: The request was successful.</li>
     * <li><strong>3xx</strong>: Redirection.</li>
     * <li><strong>4xx</strong>: Request error.</li>
     * <li><strong>5xx</strong>: A server error occurred.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Error code. Valid values:</p>
     * <ul>
     * <li>If the request is successful, no <strong>ErrorCode</strong> fields are returned.</li>
     * <li>Request failed: <strong>ErrorCode</strong> fields are returned. For more information, see <strong>Error codes</strong>.</li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Additional information. Valid values:</p>
     * <ul>
     * <li>The error message returned because the request is normal and <strong>success</strong> is returned.</li>
     * <li>If the request is abnormal, the specific exception error code is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the data is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The policy was deleted.</li>
     * <li><strong>false</strong>: The policy failed to be deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. This parameter is used to query the exact call information.</p>
     * 
     * <strong>example:</strong>
     * <p>ac1a0b2215622920113732501e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static UpdateSwimmingLaneEnableAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSwimmingLaneEnableAttributeResponseBody self = new UpdateSwimmingLaneEnableAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSwimmingLaneEnableAttributeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateSwimmingLaneEnableAttributeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateSwimmingLaneEnableAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateSwimmingLaneEnableAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSwimmingLaneEnableAttributeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateSwimmingLaneEnableAttributeResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
