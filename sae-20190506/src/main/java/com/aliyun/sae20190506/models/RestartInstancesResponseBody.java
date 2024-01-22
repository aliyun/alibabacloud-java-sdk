// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RestartInstancesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Take note of the following rules:</p>
     * <br>
     * <p>*   **2xx**: The call was successful.</p>
     * <p>*   **3xx**: The call was redirected.</p>
     * <p>*   **4xx**: The call failed.</p>
     * <p>*   **5xx**: A server error occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the application.</p>
     */
    @NameInMap("Data")
    public RestartInstancesResponseBodyData data;

    /**
     * <p>The error code returned if the request failed. Take note of the following rules:</p>
     * <br>
     * <p>*   The **ErrorCode** parameter is not returned if the request succeeds.</p>
     * <p>*   If the call fails, the **ErrorCode** parameter is returned. For more information, see the "**Error codes**" section of this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information that is returned. Take note of the following rules:</p>
     * <br>
     * <p>*   success: If the call is successful, **success** is returned.</p>
     * <p>*   An error code: If the call fails, an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Specifies whether the instances are successfully restarted. Take note of the following rules:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID that is used to query the details of the request.</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static RestartInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartInstancesResponseBody self = new RestartInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RestartInstancesResponseBody setData(RestartInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RestartInstancesResponseBodyData getData() {
        return this.data;
    }

    public RestartInstancesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RestartInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RestartInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RestartInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RestartInstancesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class RestartInstancesResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the change order.</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        public static RestartInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RestartInstancesResponseBodyData self = new RestartInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RestartInstancesResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

}
