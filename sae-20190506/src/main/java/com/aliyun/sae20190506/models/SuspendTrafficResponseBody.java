// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class SuspendTrafficResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>3xx</strong>: The request was redirected.</p>
     * </li>
     * <li><p><strong>4xx</strong>: A client-side error occurred.</p>
     * </li>
     * <li><p><strong>5xx</strong>: A server-side error occurred.</p>
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
    public SuspendTrafficResponseBodyData data;

    /**
     * <p>The error code. This parameter is returned only if the request fails. For more information, see the <strong>Error codes</strong> section in this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The response message.</p>
     * <ul>
     * <li><p>If the request is successful, <strong>success</strong> is returned.</p>
     * </li>
     * <li><p>If the request fails, a specific error code is returned.</p>
     * </li>
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
     * <p>B4D805CA-926D-41B1-8E63-7AD0C1ED****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static SuspendTrafficResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SuspendTrafficResponseBody self = new SuspendTrafficResponseBody();
        return TeaModel.build(map, self);
    }

    public SuspendTrafficResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SuspendTrafficResponseBody setData(SuspendTrafficResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SuspendTrafficResponseBodyData getData() {
        return this.data;
    }

    public SuspendTrafficResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SuspendTrafficResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SuspendTrafficResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SuspendTrafficResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public SuspendTrafficResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class SuspendTrafficResponseBodyData extends TeaModel {
        /**
         * <p>A detailed description of the result.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("msg")
        public String msg;

        /**
         * <p>Indicates whether the traffic was successfully removed. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The traffic was removed.</p>
         * </li>
         * <li><p><strong>false</strong>: The traffic was not removed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("success")
        public Boolean success;

        public static SuspendTrafficResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SuspendTrafficResponseBodyData self = new SuspendTrafficResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SuspendTrafficResponseBodyData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public SuspendTrafficResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
