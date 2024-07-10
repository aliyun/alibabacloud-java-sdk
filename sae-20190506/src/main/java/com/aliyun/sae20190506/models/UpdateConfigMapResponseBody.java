// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateConfigMapResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the ConfigMap instance was updated. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The instance was updated.</li>
     * <li><strong>false</strong>: The instance failed to be updated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the ConfigMap instance.</p>
     */
    @NameInMap("Data")
    public UpdateConfigMapResponseBodyData data;

    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><strong>2xx:</strong>: indicates that the call was successful.</li>
     * <li><strong>3xx</strong>: indicates that the call was redirected.</li>
     * <li><strong>4xx</strong>: indicates that the call failed.</li>
     * <li><strong>5xx</strong>: indicates that a server error occurred.</li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The ID of the trace. The ID is used to query the details of a request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The returned information.</p>
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
     * <p>The returned result.</p>
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
         * <p>The returned error code. Valid values:</p>
         * <ul>
         * <li>If the call is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
         * <li>If the call fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the &quot;<strong>Error codes</strong>&quot; section of this topic.</li>
         * </ul>
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
