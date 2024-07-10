// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class AbortAndRollbackChangeOrderResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the change order was terminated or the application was rolled back. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The change order was terminated or the application was rolled back.</li>
     * <li><strong>false</strong>: The change order could not be terminated or the application could not be rolled back.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the change order.</p>
     */
    @NameInMap("Data")
    public AbortAndRollbackChangeOrderResponseBodyData data;

    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: indicates that the request was successful.</li>
     * <li><strong>3xx</strong>: indicates that the request was redirected.</li>
     * <li><strong>4xx</strong>: indicates that the request was invalid.</li>
     * <li><strong>5xx</strong>: indicates that a server error occurred.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The ID of the trace. It is used to query the details of a request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The details of the change order.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static AbortAndRollbackChangeOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AbortAndRollbackChangeOrderResponseBody self = new AbortAndRollbackChangeOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public AbortAndRollbackChangeOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AbortAndRollbackChangeOrderResponseBody setData(AbortAndRollbackChangeOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AbortAndRollbackChangeOrderResponseBodyData getData() {
        return this.data;
    }

    public AbortAndRollbackChangeOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AbortAndRollbackChangeOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AbortAndRollbackChangeOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AbortAndRollbackChangeOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AbortAndRollbackChangeOrderResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class AbortAndRollbackChangeOrderResponseBodyData extends TeaModel {
        /**
         * <p>The error code.</p>
         * <ul>
         * <li>The <strong>ErrorCode</strong> parameter is not returned when the request succeeds.</li>
         * <li>The <strong>ErrorCode</strong> parameter is returned when the request fails. For more information, see <strong>Error codes</strong> in this topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ba386059-69b1-4e65-b1e5-0682d9fa****</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        public static AbortAndRollbackChangeOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AbortAndRollbackChangeOrderResponseBodyData self = new AbortAndRollbackChangeOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AbortAndRollbackChangeOrderResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

}
