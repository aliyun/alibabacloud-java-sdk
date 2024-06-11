// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DeleteRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRoleResponseBody body;

    public static DeleteRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoleResponse self = new DeleteRoleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRoleResponse setBody(DeleteRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRoleResponseBody getBody() {
        return this.body;
    }

}
