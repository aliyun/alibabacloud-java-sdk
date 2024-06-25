// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class UpdateSqlInstanceNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSqlInstanceNameResponseBody body;

    public static UpdateSqlInstanceNameResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSqlInstanceNameResponse self = new UpdateSqlInstanceNameResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSqlInstanceNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSqlInstanceNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSqlInstanceNameResponse setBody(UpdateSqlInstanceNameResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSqlInstanceNameResponseBody getBody() {
        return this.body;
    }

}
