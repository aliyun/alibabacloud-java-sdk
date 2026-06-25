// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RescaleApplicationVerticallyResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li><p><strong>2xx</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>3xx</strong>: The request was redirected.</p>
     * </li>
     * <li><p><strong>4xx</strong>: A request error occurred.</p>
     * </li>
     * <li><p><strong>5xx</strong>: A server error occurred.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
     * <ul>
     * <li><p>If the request is successful, this parameter is not returned.</p>
     * </li>
     * <li><p>If the request fails, this parameter is returned. For more information, see the <strong>Error codes</strong> section of this topic.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>空</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AB521DBB-FA78-42E6-803F-A862EA4F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the instance type was successfully changed.</p>
     * <ul>
     * <li><p><strong>true</strong>: The change was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The change failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID of the request. You can use this ID to query the details of the request.</p>
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
         * <p>The ID of the change order.</p>
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
