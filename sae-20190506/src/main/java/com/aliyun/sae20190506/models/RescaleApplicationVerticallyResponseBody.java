// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RescaleApplicationVerticallyResponseBody extends TeaModel {
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
    public RescaleApplicationVerticallyResponseBodyData data;

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
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the instance specifications are changed. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. It can be used to query details of a request.</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static RescaleApplicationVerticallyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RescaleApplicationVerticallyResponseBody self = new RescaleApplicationVerticallyResponseBody();
        return TeaModel.build(map, self);
    }

    public RescaleApplicationVerticallyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RescaleApplicationVerticallyResponseBody setData(RescaleApplicationVerticallyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RescaleApplicationVerticallyResponseBodyData getData() {
        return this.data;
    }

    public RescaleApplicationVerticallyResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RescaleApplicationVerticallyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RescaleApplicationVerticallyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RescaleApplicationVerticallyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RescaleApplicationVerticallyResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class RescaleApplicationVerticallyResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the change order.</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        public static RescaleApplicationVerticallyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RescaleApplicationVerticallyResponseBodyData self = new RescaleApplicationVerticallyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RescaleApplicationVerticallyResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

}
