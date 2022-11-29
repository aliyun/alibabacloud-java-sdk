// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteSecretResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DeleteSecretResponseBodyData data;

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

    public static DeleteSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecretResponseBody self = new DeleteSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSecretResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteSecretResponseBody setData(DeleteSecretResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteSecretResponseBodyData getData() {
        return this.data;
    }

    public DeleteSecretResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteSecretResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSecretResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteSecretResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DeleteSecretResponseBodyData extends TeaModel {
        @NameInMap("SecretId")
        public Long secretId;

        public static DeleteSecretResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteSecretResponseBodyData self = new DeleteSecretResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteSecretResponseBodyData setSecretId(Long secretId) {
            this.secretId = secretId;
            return this;
        }
        public Long getSecretId() {
            return this.secretId;
        }

    }

}
