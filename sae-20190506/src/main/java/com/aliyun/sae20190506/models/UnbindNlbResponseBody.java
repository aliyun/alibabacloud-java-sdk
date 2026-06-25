// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UnbindNlbResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li><p><strong>2xx</strong>: Success.</p>
     * </li>
     * <li><p><strong>3xx</strong>: Redirection.</p>
     * </li>
     * <li><p><strong>4xx</strong>: Client error.</p>
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
    public UnbindNlbResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li><p>The <strong>ErrorCode</strong> parameter is not returned if the request is successful.</p>
     * </li>
     * <li><p>The <strong>ErrorCode</strong> parameter is returned if the request fails. For more information, see the <strong>Error codes</strong> section of this topic.</p>
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
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
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
     * <p>The trace ID for the request. Use this ID to query request details.</p>
     * 
     * <strong>example:</strong>
     * <p>0a981dd515966966104121683d****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static UnbindNlbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindNlbResponseBody self = new UnbindNlbResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindNlbResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UnbindNlbResponseBody setData(UnbindNlbResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UnbindNlbResponseBodyData getData() {
        return this.data;
    }

    public UnbindNlbResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UnbindNlbResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnbindNlbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnbindNlbResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UnbindNlbResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class UnbindNlbResponseBodyData extends TeaModel {
        /**
         * <p>The change order ID. Use this ID to check the task\&quot;s execution status.</p>
         * 
         * <strong>example:</strong>
         * <p>ba386059-69b1-4e65-b1e5-0682d9fa****</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        public static UnbindNlbResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UnbindNlbResponseBodyData self = new UnbindNlbResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UnbindNlbResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

}
