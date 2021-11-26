// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateConfigMapResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateConfigMapResponseBodyData data;

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

    public static CreateConfigMapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigMapResponseBody self = new CreateConfigMapResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateConfigMapResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateConfigMapResponseBody setData(CreateConfigMapResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateConfigMapResponseBodyData getData() {
        return this.data;
    }

    public CreateConfigMapResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateConfigMapResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateConfigMapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateConfigMapResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateConfigMapResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CreateConfigMapResponseBodyData extends TeaModel {
        @NameInMap("ConfigMapId")
        public Long configMapId;

        public static CreateConfigMapResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateConfigMapResponseBodyData self = new CreateConfigMapResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateConfigMapResponseBodyData setConfigMapId(Long configMapId) {
            this.configMapId = configMapId;
            return this;
        }
        public Long getConfigMapId() {
            return this.configMapId;
        }

    }

}
