// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UnbindAppDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindAppDomainResponseBody body;

    public static UnbindAppDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindAppDomainResponse self = new UnbindAppDomainResponse();
        return TeaModel.build(map, self);
    }

    public UnbindAppDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindAppDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindAppDomainResponse setBody(UnbindAppDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindAppDomainResponseBody getBody() {
        return this.body;
    }

}
