// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockUnbindResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyWebLockUnbindResponseBody body;

    public static ModifyWebLockUnbindResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebLockUnbindResponse self = new ModifyWebLockUnbindResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWebLockUnbindResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWebLockUnbindResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyWebLockUnbindResponse setBody(ModifyWebLockUnbindResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWebLockUnbindResponseBody getBody() {
        return this.body;
    }

}
