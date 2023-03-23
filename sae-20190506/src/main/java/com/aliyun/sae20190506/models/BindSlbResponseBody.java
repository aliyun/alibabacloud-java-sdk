// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class BindSlbResponseBody extends TeaModel {
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
    public BindSlbResponseBodyData data;

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
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the SLB instance was successfully associated with the application. Valid values:</p>
     * <br>
     * <p>*   **true**: The SLB instance was successfully associated with the application.</p>
     * <p>*   **false**: The SLB instance could not be associated with the application.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. It can be used to query the details of a request.</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static BindSlbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindSlbResponseBody self = new BindSlbResponseBody();
        return TeaModel.build(map, self);
    }

    public BindSlbResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BindSlbResponseBody setData(BindSlbResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BindSlbResponseBodyData getData() {
        return this.data;
    }

    public BindSlbResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public BindSlbResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindSlbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindSlbResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BindSlbResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class BindSlbResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the change order. It can be used to query the task status.</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        public static BindSlbResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BindSlbResponseBodyData self = new BindSlbResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BindSlbResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

}
