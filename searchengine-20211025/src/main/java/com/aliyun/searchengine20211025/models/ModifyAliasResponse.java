// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyAliasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAliasResponseBody body;

    public static ModifyAliasResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAliasResponse self = new ModifyAliasResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAliasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAliasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAliasResponse setBody(ModifyAliasResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAliasResponseBody getBody() {
        return this.body;
    }

}
