// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteConfigMapResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DeleteConfigMapResponseBodyData data;

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
