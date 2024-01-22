// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class AbortChangeOrderResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the change order was terminated. Valid values:</p>
     * <br>
     * <p>*   **true**: The change order was terminated.</p>
     * <p>*   **false**: The change order could not be terminated.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the change order.</p>
     */
    @NameInMap("Data")
    public AbortChangeOrderResponseBodyData data;

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
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static AbortChangeOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AbortChangeOrderResponseBody self = new AbortChangeOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public AbortChangeOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AbortChangeOrderResponseBody setData(AbortChangeOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AbortChangeOrderResponseBodyData getData() {
        return this.data;
    }

    public AbortChangeOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AbortChangeOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AbortChangeOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AbortChangeOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AbortChangeOrderResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class AbortChangeOrderResponseBodyData extends TeaModel {
        /**
         * <p>The error code.</p>
         * <br>
         * <p>*   The **ErrorCode** parameter is not returned when the request succeeds.</p>
         * <p>*   The **ErrorCode** parameter is returned when the request fails. For more information, see **Error codes** in this topic.</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        public static AbortChangeOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AbortChangeOrderResponseBodyData self = new AbortChangeOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AbortChangeOrderResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

}
