// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteConfigMapResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned for the request.</p>
     * <ul>
     * <li><p><strong>2xx</strong>: success</p>
     * </li>
     * <li><p><strong>3xx</strong>: redirection</p>
     * </li>
     * <li><p><strong>4xx</strong>: client error</p>
     * </li>
     * <li><p><strong>5xx</strong>: server error</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The operation result.</p>
     */
    @NameInMap("Data")
    public DeleteConfigMapResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li><p>Not returned if the request is successful.</p>
     * </li>
     * <li><p>Returned if the request fails. For more information, see the <strong>Error codes</strong> section in this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The response message.</p>
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
     * <p>Indicates whether the deletion succeeded. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The deletion was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The deletion failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID for querying request details.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DeleteConfigMapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigMapResponseBody self = new DeleteConfigMapResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteConfigMapResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteConfigMapResponseBody setData(DeleteConfigMapResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteConfigMapResponseBodyData getData() {
        return this.data;
    }

    public DeleteConfigMapResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteConfigMapResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteConfigMapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteConfigMapResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteConfigMapResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DeleteConfigMapResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the deleted ConfigMap instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ConfigMapId")
        public Long configMapId;

        public static DeleteConfigMapResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteConfigMapResponseBodyData self = new DeleteConfigMapResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteConfigMapResponseBodyData setConfigMapId(Long configMapId) {
            this.configMapId = configMapId;
            return this;
        }
        public Long getConfigMapId() {
            return this.configMapId;
        }

    }

}
