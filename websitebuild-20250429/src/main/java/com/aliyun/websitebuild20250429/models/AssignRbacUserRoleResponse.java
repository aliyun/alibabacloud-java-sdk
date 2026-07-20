// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AssignRbacUserRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssignRbacUserRoleResponseBody body;

    public static AssignRbacUserRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        AssignRbacUserRoleResponse self = new AssignRbacUserRoleResponse();
        return TeaModel.build(map, self);
    }

    public AssignRbacUserRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssignRbacUserRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssignRbacUserRoleResponse setBody(AssignRbacUserRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public AssignRbacUserRoleResponseBody getBody() {
        return this.body;
    }

}
