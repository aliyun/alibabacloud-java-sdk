// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ReduceApplicationCapacityByInstanceIdsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>*   **2xx**: The call was successful.</p>
     * <p>*   **3xx**: The call was redirected.</p>
     * <p>*   **4xx**: The call failed.</p>
     * <p>*   **5xx**: A server error occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the change process.</p>
     */
    @NameInMap("Data")
    public ReduceApplicationCapacityByInstanceIdsResponseBodyData data;

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
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the information of the change order was queried. Take note of the following rules:</p>
     * <br>
     * <p>*   **true**: The information was queried.</p>
     * <p>*   **false**: The image failed to be found.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID that is used to query the details of the request.</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static ReduceApplicationCapacityByInstanceIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReduceApplicationCapacityByInstanceIdsResponseBody self = new ReduceApplicationCapacityByInstanceIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public ReduceApplicationCapacityByInstanceIdsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReduceApplicationCapacityByInstanceIdsResponseBody setData(ReduceApplicationCapacityByInstanceIdsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReduceApplicationCapacityByInstanceIdsResponseBodyData getData() {
        return this.data;
    }

    public ReduceApplicationCapacityByInstanceIdsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ReduceApplicationCapacityByInstanceIdsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReduceApplicationCapacityByInstanceIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReduceApplicationCapacityByInstanceIdsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ReduceApplicationCapacityByInstanceIdsResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ReduceApplicationCapacityByInstanceIdsResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the change process.</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        public static ReduceApplicationCapacityByInstanceIdsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReduceApplicationCapacityByInstanceIdsResponseBodyData self = new ReduceApplicationCapacityByInstanceIdsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReduceApplicationCapacityByInstanceIdsResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

}
