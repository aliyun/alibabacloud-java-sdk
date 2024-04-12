// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostShareKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyHostShareKeyResponseBody body;

    public static ModifyHostShareKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostShareKeyResponse self = new ModifyHostShareKeyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHostShareKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHostShareKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHostShareKeyResponse setBody(ModifyHostShareKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHostShareKeyResponseBody getBody() {
        return this.body;
    }

}
