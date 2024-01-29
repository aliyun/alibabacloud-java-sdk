// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRoleResponseBody body;

    public static CreateRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRoleResponse self = new CreateRoleResponse();
        return TeaModel.build(map, self);
    }

    public CreateRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRoleResponse setBody(CreateRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRoleResponseBody getBody() {
        return this.body;
    }

}
