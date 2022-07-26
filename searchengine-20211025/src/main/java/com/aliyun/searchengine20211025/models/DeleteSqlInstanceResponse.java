// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class DeleteSqlInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSqlInstanceResponseBody body;

    public static DeleteSqlInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSqlInstanceResponse self = new DeleteSqlInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSqlInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSqlInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSqlInstanceResponse setBody(DeleteSqlInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSqlInstanceResponseBody getBody() {
        return this.body;
    }

}
