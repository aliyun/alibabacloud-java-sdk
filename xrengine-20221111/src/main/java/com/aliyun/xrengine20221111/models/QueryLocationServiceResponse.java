// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class QueryLocationServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryLocationServiceResponseBody body;

    public static QueryLocationServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLocationServiceResponse self = new QueryLocationServiceResponse();
        return TeaModel.build(map, self);
    }

    public QueryLocationServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLocationServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryLocationServiceResponse setBody(QueryLocationServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLocationServiceResponseBody getBody() {
        return this.body;
    }

}
