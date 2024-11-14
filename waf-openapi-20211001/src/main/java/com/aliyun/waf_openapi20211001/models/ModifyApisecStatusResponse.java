// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyApisecStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyApisecStatusResponseBody body;

    public static ModifyApisecStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApisecStatusResponse self = new ModifyApisecStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApisecStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApisecStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyApisecStatusResponse setBody(ModifyApisecStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApisecStatusResponseBody getBody() {
        return this.body;
    }

}
