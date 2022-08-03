// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class DeleteServiceLinkedRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteServiceLinkedRoleResponseBody body;

    public static DeleteServiceLinkedRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceLinkedRoleResponse self = new DeleteServiceLinkedRoleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServiceLinkedRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServiceLinkedRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteServiceLinkedRoleResponse setBody(DeleteServiceLinkedRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServiceLinkedRoleResponseBody getBody() {
        return this.body;
    }

}
