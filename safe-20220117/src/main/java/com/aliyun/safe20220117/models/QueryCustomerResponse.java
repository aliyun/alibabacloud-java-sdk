// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class QueryCustomerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCustomerResponseBody body;

    public static QueryCustomerResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomerResponse self = new QueryCustomerResponse();
        return TeaModel.build(map, self);
    }

    public QueryCustomerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCustomerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCustomerResponse setBody(QueryCustomerResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCustomerResponseBody getBody() {
        return this.body;
    }

}
