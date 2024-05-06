// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPasswordResponseBody body;

    public static ModifyPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPasswordResponse self = new ModifyPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPasswordResponse setBody(ModifyPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPasswordResponseBody getBody() {
        return this.body;
    }

}
