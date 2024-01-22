// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeInstanceLogResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the log of the instance was obtained. Valid values:</p>
     * <br>
     * <p>*   **true**: indicates that the log was obtained.</p>
     * <p>*   **false**: indicates that the log could not be obtained.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error code.</p>
     * <br>
     * <p>*   The **ErrorCode** parameter is not returned when the request succeeds.</p>
     * <p>*   The **ErrorCode** parameter is returned when the request fails. For more information, see **Error codes** in this topic.</p>
     */
    @NameInMap("Data")
    public String data;

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
     * <p>The ID of the trace.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>*   **success** is returned when the request succeeds.</p>
     * <p>*   An error code is returned when the request fails.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The log of the instance.</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DescribeInstanceLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceLogResponseBody self = new DescribeInstanceLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceLogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeInstanceLogResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeInstanceLogResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeInstanceLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeInstanceLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeInstanceLogResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
