// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyApisecAbnormalsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyApisecAbnormalsResponseBody body;

    public static ModifyApisecAbnormalsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApisecAbnormalsResponse self = new ModifyApisecAbnormalsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApisecAbnormalsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApisecAbnormalsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyApisecAbnormalsResponse setBody(ModifyApisecAbnormalsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApisecAbnormalsResponseBody getBody() {
        return this.body;
    }

}
