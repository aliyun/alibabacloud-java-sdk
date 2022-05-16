// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.partnerintl20181227.models;

import com.aliyun.tea.*;

public class QueryImageIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryImageIdResponseBody body;

    public static QueryImageIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryImageIdResponse self = new QueryImageIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryImageIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryImageIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryImageIdResponse setBody(QueryImageIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryImageIdResponseBody getBody() {
        return this.body;
    }

}
