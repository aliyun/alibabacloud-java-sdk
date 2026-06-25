// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class AbortChangeOrderResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>3xx</strong>: The request was redirected.</p>
     * </li>
     * <li><p><strong>4xx</strong>: A client error occurred.</p>
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
    public AbortChangeOrderResponseBodyData data;

    /**
     * <p>The error code. This parameter is returned only if the request fails. For more information, see the <strong>Error codes</strong> section in this topic.</p>
     * <ul>
     * <li><p>If the request is successful, this parameter is not returned.</p>
     * </li>
     * <li><p>If the request fails, this parameter is returned. For more information, see the <strong>Error codes</strong> section in this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The message returned.</p>
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
     * <p>Indicates whether the change order is stopped. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The change order is stopped.</p>
     * </li>
     * <li><p><strong>false</strong>: The change order is not stopped.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static AbortChangeOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AbortChangeOrderResponseBody self = new AbortChangeOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public AbortChangeOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AbortChangeOrderResponseBody setData(AbortChangeOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AbortChangeOrderResponseBodyData getData() {
        return this.data;
    }

    public AbortChangeOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AbortChangeOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AbortChangeOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AbortChangeOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AbortChangeOrderResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class AbortChangeOrderResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the change order.</p>
         * 
         * <strong>example:</strong>
         * <p>be2e1c76-682b-4897-98d3-1d8d6478****</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        public static AbortChangeOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AbortChangeOrderResponseBodyData self = new AbortChangeOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AbortChangeOrderResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

}
