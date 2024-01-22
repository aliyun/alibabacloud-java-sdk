// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateConfigMapResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the ConfigMap instance was updated. Valid values:</p>
     * <br>
     * <p>*   **true**: The instance was updated.</p>
     * <p>*   **false**: The instance failed to be updated.</p>
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
     * <br>
     * <p>*   **2xx:**: indicates that the call was successful.</p>
     * <p>*   **3xx**: indicates that the call was redirected.</p>
     * <p>*   **4xx**: indicates that the call failed.</p>
     * <p>*   **5xx**: indicates that a server error occurred.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The ID of the trace. The ID is used to query the details of a request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The returned information.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The returned result.</p>
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
         * <br>
         * <p>*   If the call is successful, the **ErrorCode** parameter is not returned.</p>
         * <p>*   If the call fails, the **ErrorCode** parameter is returned. For more information, see the "**Error codes**" section of this topic.</p>
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
