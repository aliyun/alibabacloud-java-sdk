// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class CreateServiceIdentityRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateServiceIdentityRoleResponseBody body;

    public static CreateServiceIdentityRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceIdentityRoleResponse self = new CreateServiceIdentityRoleResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceIdentityRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceIdentityRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServiceIdentityRoleResponse setBody(CreateServiceIdentityRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceIdentityRoleResponseBody getBody() {
        return this.body;
    }

}
