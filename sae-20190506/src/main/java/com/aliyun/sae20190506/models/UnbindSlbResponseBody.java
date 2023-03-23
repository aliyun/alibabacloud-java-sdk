// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UnbindSlbResponseBody extends TeaModel {
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
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public UnbindSlbResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <br>
     * <p>*   The **ErrorCode** parameter is not returned when the request succeeds.</p>
     * <p>*   The **ErrorCode** parameter is returned when the request fails. For more information, see **Error codes** in this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>*   **success** is returned when the request succeeds.</p>
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
     * <p>Indicates whether the internal-facing or Internet-facing SLB instance was disassociated successfully. Valid values:</p>
     * <br>
     * <p>*   **true**: The SLB instance was disassociated successfully.</p>
     * <p>*   **false**: The SLB instance could not be disassociated.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. It can be used to query the details of a request.</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static UnbindSlbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindSlbResponseBody self = new UnbindSlbResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindSlbResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UnbindSlbResponseBody setData(UnbindSlbResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UnbindSlbResponseBodyData getData() {
        return this.data;
    }

    public UnbindSlbResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UnbindSlbResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnbindSlbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnbindSlbResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UnbindSlbResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class UnbindSlbResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the change order. It can be used to query the task status.</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        public static UnbindSlbResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UnbindSlbResponseBodyData self = new UnbindSlbResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UnbindSlbResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

}
