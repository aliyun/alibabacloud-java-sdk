// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class StartApplicationResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: The call was successful.</li>
     * <li><strong>3xx</strong>: The call was redirected.</li>
     * <li><strong>4xx</strong>: The call failed.</li>
     * <li><strong>5xx</strong>: A server error occurred.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public StartApplicationResponseBodyData data;

    /**
     * <p>The error code returned. Take note of the following rules:</p>
     * <ul>
     * <li>If the call is successful, <strong>ErrorCode</strong> is not returned.</li>
     * <li>If the call fails, <strong>ErrorCode</strong> is returned. For more information, see the &quot;<strong>Error codes</strong>&quot; section in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Null</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message. Take note of the following rules:</p>
     * <ul>
     * <li>If the call is successful, <strong>success</strong> is returned.</li>
     * <li>If the call fails, an error code is returned.</li>
     * </ul>
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
     * <p>7BD8F4C7-D84C-4D46-9885-8212997E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the application is started. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID that is used to query the details of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc3b6e215637275918588187d****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static StartApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartApplicationResponseBody self = new StartApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public StartApplicationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartApplicationResponseBody setData(StartApplicationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartApplicationResponseBodyData getData() {
        return this.data;
    }

    public StartApplicationResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public StartApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartApplicationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public StartApplicationResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class StartApplicationResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the change order.</p>
         * 
         * <strong>example:</strong>
         * <p>4a815998-b468-4bea-b7d8-59f52a44****</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        public static StartApplicationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartApplicationResponseBodyData self = new StartApplicationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartApplicationResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

}
