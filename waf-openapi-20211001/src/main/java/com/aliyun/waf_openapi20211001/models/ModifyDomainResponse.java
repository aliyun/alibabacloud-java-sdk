// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDomainResponseBody body;

    public static ModifyDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDomainResponse self = new ModifyDomainResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDomainResponse setBody(ModifyDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDomainResponseBody getBody() {
        return this.body;
    }

}
