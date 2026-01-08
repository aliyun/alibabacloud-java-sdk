// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ResumeTrafficResponseBody extends TeaModel {
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
     * <p>The returned results.</p>
     */
    @NameInMap("Data")
    public ResumeTrafficResponseBodyData data;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The message returned for the operation. Valid values:</p>
     * <ul>
     * <li>If the request is successful, <strong>success</strong> is returned.</li>
     * <li>If the request fails, a specific error code is returned.</li>
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
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>True</strong>: The traffic was resumed.</li>
     * <li><strong>False</strong>: The traffic failed to be resumed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ac1a0b2215622920113732501e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static ResumeTrafficResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResumeTrafficResponseBody self = new ResumeTrafficResponseBody();
        return TeaModel.build(map, self);
    }

    public ResumeTrafficResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ResumeTrafficResponseBody setData(ResumeTrafficResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ResumeTrafficResponseBodyData getData() {
        return this.data;
    }

    public ResumeTrafficResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ResumeTrafficResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ResumeTrafficResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResumeTrafficResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ResumeTrafficResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ResumeTrafficResponseBodyData extends TeaModel {
        /**
         * <p>The description of the returned code.</p>
         * 
         * <strong>example:</strong>
         * <p>succeed in handling request</p>
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
         * <p>true</p>
         */
        @NameInMap("success")
        public Boolean success;

        public static ResumeTrafficResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ResumeTrafficResponseBodyData self = new ResumeTrafficResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ResumeTrafficResponseBodyData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public ResumeTrafficResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
