// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class SetRbacRoleHierarchyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetRbacRoleHierarchyResponseBody body;

    public static SetRbacRoleHierarchyResponse build(java.util.Map<String, ?> map) throws Exception {
        SetRbacRoleHierarchyResponse self = new SetRbacRoleHierarchyResponse();
        return TeaModel.build(map, self);
    }

    public SetRbacRoleHierarchyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetRbacRoleHierarchyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetRbacRoleHierarchyResponse setBody(SetRbacRoleHierarchyResponseBody body) {
        this.body = body;
        return this;
    }
    public SetRbacRoleHierarchyResponseBody getBody() {
        return this.body;
    }

}
