// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryCustomAuthIdentityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCustomAuthIdentityResponseBody body;

    public static QueryCustomAuthIdentityResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomAuthIdentityResponse self = new QueryCustomAuthIdentityResponse();
        return TeaModel.build(map, self);
    }

    public QueryCustomAuthIdentityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCustomAuthIdentityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCustomAuthIdentityResponse setBody(QueryCustomAuthIdentityResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCustomAuthIdentityResponseBody getBody() {
        return this.body;
    }

}
