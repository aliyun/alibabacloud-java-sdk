// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateSecretResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateSecretResponseBodyData data;

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

    public static UpdateSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecretResponseBody self = new UpdateSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSecretResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateSecretResponseBody setData(UpdateSecretResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateSecretResponseBodyData getData() {
        return this.data;
    }

    public UpdateSecretResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateSecretResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSecretResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateSecretResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class UpdateSecretResponseBodyData extends TeaModel {
        @NameInMap("SecretId")
        public String secretId;

        public static UpdateSecretResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateSecretResponseBodyData self = new UpdateSecretResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateSecretResponseBodyData setSecretId(String secretId) {
            this.secretId = secretId;
            return this;
        }
        public String getSecretId() {
            return this.secretId;
        }

    }

}
