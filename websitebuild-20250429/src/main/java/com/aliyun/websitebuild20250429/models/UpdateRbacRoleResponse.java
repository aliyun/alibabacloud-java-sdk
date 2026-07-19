// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UpdateRbacRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRbacRoleResponseBody body;

    public static UpdateRbacRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRbacRoleResponse self = new UpdateRbacRoleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRbacRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRbacRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRbacRoleResponse setBody(UpdateRbacRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRbacRoleResponseBody getBody() {
        return this.body;
    }

}
