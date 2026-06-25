// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ExecJobResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code or a POP error code.</p>
     * <ul>
     * <li><p><strong>2xx</strong>: Success.</p>
     * </li>
     * <li><p><strong>3xx</strong>: Redirection.</p>
     * </li>
     * <li><p><strong>4xx</strong>: Request error.</p>
     * </li>
     * <li><p><strong>5xx</strong>: Server error.</p>
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
    public ExecJobResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li><p>This parameter is omitted for successful requests.</p>
     * </li>
     * <li><p>This parameter is included for failed requests. For more information, see the <strong>Error codes</strong> section of this topic.</p>
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
     * <li><p>If the request fails, an error code is returned.</p>
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
     * <p>67DD9A98-9CCC-5BE8-8C9E-B45E72F4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID for retrieving detailed information about the call.</p>
     * 
     * <strong>example:</strong>
     * <p>0b87b7e716575071334387401e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static ExecJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecJobResponseBody self = new ExecJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExecJobResponseBody setData(ExecJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecJobResponseBodyData getData() {
        return this.data;
    }

    public ExecJobResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ExecJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExecJobResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ExecJobResponseBodyData extends TeaModel {
        /**
         * <p>The HTTP status code or a POP error code.</p>
         * <ul>
         * <li><p><strong>2xx</strong>: Success.</p>
         * </li>
         * <li><p><strong>3xx</strong>: Redirection.</p>
         * </li>
         * <li><p><strong>4xx</strong>: Request error.</p>
         * </li>
         * <li><p><strong>5xx</strong>: Server error.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>manual-3db7a8fa-5d40-4edc-92e4-49d50eab****</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <p>The returned message.</p>
         * <ul>
         * <li><p>If the request is successful, <strong>success</strong> is returned.</p>
         * </li>
         * <li><p>If the request fails, an error code is returned.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <p>Whether the job was successfully executed.</p>
         * <ul>
         * <li><p><strong>true</strong>: The execution was successful.</p>
         * </li>
         * <li><p><strong>false</strong>: The execution failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public String success;

        public static ExecJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecJobResponseBodyData self = new ExecJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecJobResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ExecJobResponseBodyData setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ExecJobResponseBodyData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public ExecJobResponseBodyData setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

    }

}
