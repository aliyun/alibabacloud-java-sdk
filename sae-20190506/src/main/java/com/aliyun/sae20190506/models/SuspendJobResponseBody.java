// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class SuspendJobResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: The call was successful.</p>
     * <p>*   **3xx**: The call was redirected.</p>
     * <p>*   **4xx**: The call failed.</p>
     * <p>*   **5xx**: A server error occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Whether the execution is successful.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The error code returned. Valid values:</p>
     * <br>
     * <p>*   The **ErrorCode** parameter is not returned if the request succeeds.</p>
     * <p>*   If the call fails, the **ErrorCode** parameter is returned. For more information, see **Error codes** in this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information that is returned. Valid values:</p>
     * <br>
     * <p>*   success: If the call is successful, **success** is returned.</p>
     * <p>*   An error code: If the call fails, an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the job was executed. Valid values:</p>
     * <br>
     * <p>*   **true**: The job was executed.</p>
     * <p>*   **false**: The job failed to be executed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID that is used to query the details of the request.</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static SuspendJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SuspendJobResponseBody self = new SuspendJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SuspendJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SuspendJobResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SuspendJobResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SuspendJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SuspendJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SuspendJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SuspendJobResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
