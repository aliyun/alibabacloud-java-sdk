// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyAppKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAppKeyResponseBody body;

    public static ModifyAppKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppKeyResponse self = new ModifyAppKeyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAppKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAppKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAppKeyResponse setBody(ModifyAppKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAppKeyResponseBody getBody() {
        return this.body;
    }

}
