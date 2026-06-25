// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class BindNlbResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li><p><strong>2xx</strong>: Successful.</p>
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
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public BindNlbResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li><p>This parameter is not returned if the request is successful.</p>
     * </li>
     * <li><p>This parameter is returned if the request fails. For more information, see the <strong>Error codes</strong> section.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The response message.</p>
     * <ul>
     * <li><p>A value of <strong>success</strong> is returned if the request is successful.</p>
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
     * <p>The request\&quot;s trace ID, used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>0a06dfe717389800573793090e0589</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static BindNlbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindNlbResponseBody self = new BindNlbResponseBody();
        return TeaModel.build(map, self);
    }

    public BindNlbResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BindNlbResponseBody setData(BindNlbResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BindNlbResponseBodyData getData() {
        return this.data;
    }

    public BindNlbResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public BindNlbResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindNlbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindNlbResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BindNlbResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class BindNlbResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the change order. You can use this ID to query the task status.</p>
         * 
         * <strong>example:</strong>
         * <p>ba386059-69b1-4e65-b1e5-0682d9fa****</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        public static BindNlbResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BindNlbResponseBodyData self = new BindNlbResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BindNlbResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

    }

}
