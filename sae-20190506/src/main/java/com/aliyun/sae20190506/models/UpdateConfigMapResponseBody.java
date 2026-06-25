// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateConfigMapResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code or the POP error code.</p>
     * <ul>
     * <li><p><strong>2xx</strong>: The request is successful.</p>
     * </li>
     * <li><p><strong>3xx</strong>: The request is redirected.</p>
     * </li>
     * <li><p><strong>4xx</strong>: A request error occurred.</p>
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
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public UpdateConfigMapResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li><p>This parameter is not returned if the request is successful.</p>
     * </li>
     * <li><p>This parameter is returned if the request fails. For more information, see the <strong>Error codes</strong> section in this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Additional information about the call.</p>
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
     * <p>Indicates whether the ConfigMap instance was updated.</p>
     * <ul>
     * <li><p><strong>true</strong>: The instance was updated.</p>
     * </li>
     * <li><p><strong>false</strong>: The instance failed to be updated.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID that is used to query the details of the call.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static UpdateConfigMapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigMapResponseBody self = new UpdateConfigMapResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateConfigMapResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateConfigMapResponseBody setData(UpdateConfigMapResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateConfigMapResponseBodyData getData() {
        return this.data;
    }

    public UpdateConfigMapResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateConfigMapResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateConfigMapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateConfigMapResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateConfigMapResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class UpdateConfigMapResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the ConfigMap instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ConfigMapId")
        public String configMapId;

        public static UpdateConfigMapResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateConfigMapResponseBodyData self = new UpdateConfigMapResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateConfigMapResponseBodyData setConfigMapId(String configMapId) {
            this.configMapId = configMapId;
            return this;
        }
        public String getConfigMapId() {
            return this.configMapId;
        }

    }

}
