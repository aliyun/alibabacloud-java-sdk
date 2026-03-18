// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifyHostAliasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyHostAliasResponseBody body;

    public static ModifyHostAliasResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostAliasResponse self = new ModifyHostAliasResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHostAliasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHostAliasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHostAliasResponse setBody(ModifyHostAliasResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHostAliasResponseBody getBody() {
        return this.body;
    }

}
