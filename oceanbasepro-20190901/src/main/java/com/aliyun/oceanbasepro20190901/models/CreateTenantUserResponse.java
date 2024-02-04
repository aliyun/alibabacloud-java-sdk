// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateTenantUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTenantUserResponseBody body;

    public static CreateTenantUserResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantUserResponse self = new CreateTenantUserResponse();
        return TeaModel.build(map, self);
    }

    public CreateTenantUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTenantUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTenantUserResponse setBody(CreateTenantUserResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTenantUserResponseBody getBody() {
        return this.body;
    }

}
