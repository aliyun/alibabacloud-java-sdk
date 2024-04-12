// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyUserPublicKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyUserPublicKeyResponseBody body;

    public static ModifyUserPublicKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserPublicKeyResponse self = new ModifyUserPublicKeyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyUserPublicKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyUserPublicKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyUserPublicKeyResponse setBody(ModifyUserPublicKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyUserPublicKeyResponseBody getBody() {
        return this.body;
    }

}
