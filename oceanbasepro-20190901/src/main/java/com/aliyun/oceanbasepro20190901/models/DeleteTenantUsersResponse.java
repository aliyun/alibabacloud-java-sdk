// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteTenantUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTenantUsersResponseBody body;

    public static DeleteTenantUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTenantUsersResponse self = new DeleteTenantUsersResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTenantUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTenantUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTenantUsersResponse setBody(DeleteTenantUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTenantUsersResponseBody getBody() {
        return this.body;
    }

}
