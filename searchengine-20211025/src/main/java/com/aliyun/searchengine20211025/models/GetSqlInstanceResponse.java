// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetSqlInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSqlInstanceResponseBody body;

    public static GetSqlInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSqlInstanceResponse self = new GetSqlInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetSqlInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSqlInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSqlInstanceResponse setBody(GetSqlInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSqlInstanceResponseBody getBody() {
        return this.body;
    }

}
