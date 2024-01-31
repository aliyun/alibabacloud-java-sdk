// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockStartResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyWebLockStartResponseBody body;

    public static ModifyWebLockStartResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebLockStartResponse self = new ModifyWebLockStartResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWebLockStartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWebLockStartResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyWebLockStartResponse setBody(ModifyWebLockStartResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWebLockStartResponseBody getBody() {
        return this.body;
    }

}
