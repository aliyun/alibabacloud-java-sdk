// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class UpdateSqlInstanceParamsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSqlInstanceParamsResponseBody body;

    public static UpdateSqlInstanceParamsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSqlInstanceParamsResponse self = new UpdateSqlInstanceParamsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSqlInstanceParamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSqlInstanceParamsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSqlInstanceParamsResponse setBody(UpdateSqlInstanceParamsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSqlInstanceParamsResponseBody getBody() {
        return this.body;
    }

}
