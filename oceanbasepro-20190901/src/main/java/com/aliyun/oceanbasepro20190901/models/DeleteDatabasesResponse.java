// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteDatabasesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDatabasesResponseBody body;

    public static DeleteDatabasesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatabasesResponse self = new DeleteDatabasesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDatabasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDatabasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDatabasesResponse setBody(DeleteDatabasesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDatabasesResponseBody getBody() {
        return this.body;
    }

}
