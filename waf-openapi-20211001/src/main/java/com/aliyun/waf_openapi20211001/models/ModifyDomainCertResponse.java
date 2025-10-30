// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDomainCertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDomainCertResponseBody body;

    public static ModifyDomainCertResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDomainCertResponse self = new ModifyDomainCertResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDomainCertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDomainCertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDomainCertResponse setBody(ModifyDomainCertResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDomainCertResponseBody getBody() {
        return this.body;
    }

}
