// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RescaleApplicationVerticallyResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: The request was successful.</li>
     * <li><strong>3xx</strong>: The request was redirected.</li>
     * <li><strong>4xx</strong>: The request failed.</li>
     * <li><strong>5xx</strong>: A server error occurred.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data returned.</p>
     */
    @NameInMap("Data")
    public RescaleApplicationVerticallyResponseBodyData data;

    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li>If the call is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
     * <li>If the call fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Null</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Messages returned for additional information.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AB521DBB-FA78-42E6-803F-A862EA4F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the update of instance specifications was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Updated.</li>
     * <li><strong>false</strong>: Failed to update.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Trace ID for request information.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc3b6f315637273629117900d****</p>
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
         * <p>The ticked ID of updates.</p>
         * 
         * <strong>example:</strong>
         * <p>ffd8cd45-2b5f-415d-b4d0-1003e80b****</p>
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
