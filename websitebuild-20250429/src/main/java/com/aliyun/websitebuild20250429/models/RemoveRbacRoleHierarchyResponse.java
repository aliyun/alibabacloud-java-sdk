// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class RemoveRbacRoleHierarchyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveRbacRoleHierarchyResponseBody body;

    public static RemoveRbacRoleHierarchyResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveRbacRoleHierarchyResponse self = new RemoveRbacRoleHierarchyResponse();
        return TeaModel.build(map, self);
    }

    public RemoveRbacRoleHierarchyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveRbacRoleHierarchyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveRbacRoleHierarchyResponse setBody(RemoveRbacRoleHierarchyResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveRbacRoleHierarchyResponseBody getBody() {
        return this.body;
    }

}
