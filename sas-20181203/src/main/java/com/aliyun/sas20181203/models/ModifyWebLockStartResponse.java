// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockStartResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyWebLockStartResponse setBody(ModifyWebLockStartResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWebLockStartResponseBody getBody() {
        return this.body;
    }

}
