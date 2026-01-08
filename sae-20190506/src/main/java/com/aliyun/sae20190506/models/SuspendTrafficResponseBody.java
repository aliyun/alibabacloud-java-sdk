// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class SuspendTrafficResponseBody extends TeaModel {
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
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public SuspendTrafficResponseBodyData data;

    /**
     * <p>The error code. </p>
     * <ul>
     * <li>The <strong>ErrorCode</strong> parameter is not returned when the request succeeds.</li>
     * <li>The <strong>ErrorCode</strong> parameter is returned when the request fails. For more information, see <strong>Error codes</strong> in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Null</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The message returned. Valid values:</p>
     * <ul>
     * <li>If the request was successful, <strong>success</strong> is returned.</li>
     * <li>If the request failed, an error code is returned.</li>
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
     * <p>Indicates whether the traffic was removed. Valid values: </p>
     * <ul>
     * <li><strong>true</strong>: The traffic was removed.</li>
     * <li><strong>false</strong>: The traffic failed to be removed.</li>
     * </ul>
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
         * <p>The description of the returned code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("msg")
        public String msg;

        /**
         * <p>Indicates whether the traffic was removed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The traffic was removed.</li>
         * <li><strong>false</strong>: The traffic failed to be removed.</li>
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
