// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AuthorizeAppProxyOpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuthorizeAppProxyOpsResponseBody body;

    public static AuthorizeAppProxyOpsResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeAppProxyOpsResponse self = new AuthorizeAppProxyOpsResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeAppProxyOpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeAppProxyOpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthorizeAppProxyOpsResponse setBody(AuthorizeAppProxyOpsResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeAppProxyOpsResponseBody getBody() {
        return this.body;
    }

}
