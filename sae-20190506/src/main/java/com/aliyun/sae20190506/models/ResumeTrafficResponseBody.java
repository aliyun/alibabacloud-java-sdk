// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ResumeTrafficResponseBody extends TeaModel {
    /**
     * <p>The API status code or POP error code. Valid values:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>3xx</strong>: Redirection.</p>
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
     * <p>The returned results.</p>
     */
    @NameInMap("Data")
    public ResumeTrafficResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li><p>This parameter is empty if the request is successful.</p>
     * </li>
     * <li><p>If the request fails, this parameter contains an error code. For more information, see the &quot;<strong>Error codes</strong>&quot; section of this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
     * <ul>
     * <li><p>If the request is successful, <strong>success</strong> is returned.</p>
     * </li>
     * <li><p>If the request fails, an error message is returned.</p>
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
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the traffic was resumed. <strong>True</strong> indicates that the traffic was resumed, and <strong>False</strong> indicates that the traffic was not resumed.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The trace ID of the request. You can use this ID to troubleshoot the request.</p>
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
         * <p>Details about the operation\&quot;s result.</p>
         * 
         * <strong>example:</strong>
         * <p>succeed in handling request</p>
         */
        @NameInMap("msg")
        public String msg;

        /**
         * <p>Indicates whether the traffic was resumed.</p>
         * <ul>
         * <li><p><strong>True</strong>: The traffic was resumed.</p>
         * </li>
         * <li><p><strong>False</strong>: The traffic was not resumed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
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
