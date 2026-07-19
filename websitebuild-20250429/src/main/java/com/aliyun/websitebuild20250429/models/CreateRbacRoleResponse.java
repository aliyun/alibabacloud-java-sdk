// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateRbacRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRbacRoleResponseBody body;

    public static CreateRbacRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRbacRoleResponse self = new CreateRbacRoleResponse();
        return TeaModel.build(map, self);
    }

    public CreateRbacRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRbacRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRbacRoleResponse setBody(CreateRbacRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRbacRoleResponseBody getBody() {
        return this.body;
    }

}
