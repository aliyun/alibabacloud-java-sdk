// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class QueryChangeInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryChangeInfoResponseBody body;

    public static QueryChangeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryChangeInfoResponse self = new QueryChangeInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryChangeInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryChangeInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryChangeInfoResponse setBody(QueryChangeInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryChangeInfoResponseBody getBody() {
        return this.body;
    }

}
