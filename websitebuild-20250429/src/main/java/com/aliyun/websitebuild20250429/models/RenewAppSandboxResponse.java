// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class RenewAppSandboxResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenewAppSandboxResponseBody body;

    public static RenewAppSandboxResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewAppSandboxResponse self = new RenewAppSandboxResponse();
        return TeaModel.build(map, self);
    }

    public RenewAppSandboxResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewAppSandboxResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewAppSandboxResponse setBody(RenewAppSandboxResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewAppSandboxResponseBody getBody() {
        return this.body;
    }

}
