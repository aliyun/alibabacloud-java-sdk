// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210922_105633300.models;

import com.aliyun.tea.*;

public class LcDemoResponseBody extends TeaModel {
    @NameInMap("idempotent")
    public Boolean idempotent;

    @NameInMap("data")
    public java.util.Map<String, ?> data;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("errorMessage")
    public java.io.InputStream errorMessage;

    @NameInMap("errorCode")
    public java.io.InputStream errorCode;

    @NameInMap("retry")
    public Boolean retry;

    public static LcDemoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LcDemoResponseBody self = new LcDemoResponseBody();
        return TeaModel.build(map, self);
    }

    public LcDemoResponseBody setIdempotent(Boolean idempotent) {
        this.idempotent = idempotent;
        return this;
    }
    public Boolean getIdempotent() {
        return this.idempotent;
    }

    public LcDemoResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public LcDemoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public LcDemoResponseBody setErrorMessage(java.io.InputStream errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public java.io.InputStream getErrorMessage() {
        return this.errorMessage;
    }

    public LcDemoResponseBody setErrorCode(java.io.InputStream errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public java.io.InputStream getErrorCode() {
        return this.errorCode;
    }

    public LcDemoResponseBody setRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }
    public Boolean getRetry() {
        return this.retry;
    }

}
