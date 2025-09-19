// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class BindAppDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindAppDomainResponseBody body;

    public static BindAppDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        BindAppDomainResponse self = new BindAppDomainResponse();
        return TeaModel.build(map, self);
    }

    public BindAppDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindAppDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindAppDomainResponse setBody(BindAppDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public BindAppDomainResponseBody getBody() {
        return this.body;
    }

}
