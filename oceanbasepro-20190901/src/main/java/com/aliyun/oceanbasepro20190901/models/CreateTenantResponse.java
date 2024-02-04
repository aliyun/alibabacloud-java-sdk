// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateTenantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTenantResponseBody body;

    public static CreateTenantResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantResponse self = new CreateTenantResponse();
        return TeaModel.build(map, self);
    }

    public CreateTenantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTenantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTenantResponse setBody(CreateTenantResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTenantResponseBody getBody() {
        return this.body;
    }

}
