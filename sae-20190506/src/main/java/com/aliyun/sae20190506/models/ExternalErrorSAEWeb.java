// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ExternalErrorSAEWeb extends TeaModel {
    @NameInMap("code")
    public Integer code;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ExternalErrorSAEWeb build(java.util.Map<String, ?> map) throws Exception {
        ExternalErrorSAEWeb self = new ExternalErrorSAEWeb();
        return TeaModel.build(map, self);
    }

    public ExternalErrorSAEWeb setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ExternalErrorSAEWeb setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ExternalErrorSAEWeb setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExternalErrorSAEWeb setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExternalErrorSAEWeb setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
