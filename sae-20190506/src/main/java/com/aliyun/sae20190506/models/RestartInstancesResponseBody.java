// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RestartInstancesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: indicates that the request was successful.</p>
     * <p>*   **3xx**: indicates that the request was redirected.</p>
     * <p>*   **4xx**: indicates that the request was invalid.</p>
     * <p>*   **5xx**: indicates that a server error occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the application.</p>
     */
    @NameInMap("Data")
    public RestartInstancesResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <br>
     * <p>*   If the request is successful, this parameter is not returned.****</p>
     * <p>*   This parameter is returned only if the request failed.**** For more information, see the "**Error codes**" section in this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>*   If the request is successful, **success** is returned.</p>
     * <p>*   An error code is returned when the request fails.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Specifies whether the instances are successfully restarted. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. It is used to query the details of a request.</p>
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
