// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateConfigMapResponseBody extends TeaModel {
    /**
     * <p>The API status code or POP error code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: Success.</li>
     * <li><strong>3xx</strong>: Redirection.</li>
     * <li><strong>4xx</strong>: Client error.</li>
     * <li><strong>5xx</strong>: Server error.</li>
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
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li>Successful request: The <strong>ErrorCode</strong> parameter is not returned.</li>
     * <li>Failed request: The <strong>ErrorCode</strong> parameter is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter.NotEmpty</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information about the call result.</p>
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
     * <p>Indicates whether the ConfigMap instance was updated successfully. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The update succeeded.</li>
     * <li><strong>false</strong>: The update failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID used to accurately query the call information.</p>
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
         * <p>The ConfigMap instance ID.</p>
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
