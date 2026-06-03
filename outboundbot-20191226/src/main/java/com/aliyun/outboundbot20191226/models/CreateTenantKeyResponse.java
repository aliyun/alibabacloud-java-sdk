// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateTenantKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTenantKeyResponseBody body;

    public static CreateTenantKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantKeyResponse self = new CreateTenantKeyResponse();
        return TeaModel.build(map, self);
    }

    public CreateTenantKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTenantKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTenantKeyResponse setBody(CreateTenantKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTenantKeyResponseBody getBody() {
        return this.body;
    }

}
