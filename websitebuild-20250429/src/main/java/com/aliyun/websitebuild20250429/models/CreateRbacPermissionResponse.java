// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateRbacPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRbacPermissionResponseBody body;

    public static CreateRbacPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRbacPermissionResponse self = new CreateRbacPermissionResponse();
        return TeaModel.build(map, self);
    }

    public CreateRbacPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRbacPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRbacPermissionResponse setBody(CreateRbacPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRbacPermissionResponseBody getBody() {
        return this.body;
    }

}
