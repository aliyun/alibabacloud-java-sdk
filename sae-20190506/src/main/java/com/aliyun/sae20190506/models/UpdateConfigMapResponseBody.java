// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateConfigMapResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateConfigMapResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
