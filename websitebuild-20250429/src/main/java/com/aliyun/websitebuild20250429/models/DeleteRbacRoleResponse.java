// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DeleteRbacRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRbacRoleResponseBody body;

    public static DeleteRbacRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRbacRoleResponse self = new DeleteRbacRoleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRbacRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRbacRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRbacRoleResponse setBody(DeleteRbacRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRbacRoleResponseBody getBody() {
        return this.body;
    }

}
