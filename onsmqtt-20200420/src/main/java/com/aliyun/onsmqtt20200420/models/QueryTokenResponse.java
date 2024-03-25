// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTokenResponseBody body;

    public static QueryTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTokenResponse self = new QueryTokenResponse();
        return TeaModel.build(map, self);
    }

    public QueryTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTokenResponse setBody(QueryTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTokenResponseBody getBody() {
        return this.body;
    }

}
