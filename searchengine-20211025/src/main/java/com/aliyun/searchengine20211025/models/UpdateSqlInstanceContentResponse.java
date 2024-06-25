// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class UpdateSqlInstanceContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSqlInstanceContentResponseBody body;

    public static UpdateSqlInstanceContentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSqlInstanceContentResponse self = new UpdateSqlInstanceContentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSqlInstanceContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSqlInstanceContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSqlInstanceContentResponse setBody(UpdateSqlInstanceContentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSqlInstanceContentResponseBody getBody() {
        return this.body;
    }

}
