// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class DeleteAppResourcePermissionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAppResourcePermissionsResponseBody body;

    public static DeleteAppResourcePermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppResourcePermissionsResponse self = new DeleteAppResourcePermissionsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppResourcePermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppResourcePermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppResourcePermissionsResponse setBody(DeleteAppResourcePermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppResourcePermissionsResponseBody getBody() {
        return this.body;
    }

}
