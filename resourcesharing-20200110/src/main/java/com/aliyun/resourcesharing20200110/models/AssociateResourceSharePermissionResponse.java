// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class AssociateResourceSharePermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateResourceSharePermissionResponseBody body;

    public static AssociateResourceSharePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateResourceSharePermissionResponse self = new AssociateResourceSharePermissionResponse();
        return TeaModel.build(map, self);
    }

    public AssociateResourceSharePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateResourceSharePermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateResourceSharePermissionResponse setBody(AssociateResourceSharePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateResourceSharePermissionResponseBody getBody() {
        return this.body;
    }

}
