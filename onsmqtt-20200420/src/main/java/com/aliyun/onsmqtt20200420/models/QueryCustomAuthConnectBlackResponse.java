// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryCustomAuthConnectBlackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCustomAuthConnectBlackResponseBody body;

    public static QueryCustomAuthConnectBlackResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomAuthConnectBlackResponse self = new QueryCustomAuthConnectBlackResponse();
        return TeaModel.build(map, self);
    }

    public QueryCustomAuthConnectBlackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCustomAuthConnectBlackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCustomAuthConnectBlackResponse setBody(QueryCustomAuthConnectBlackResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCustomAuthConnectBlackResponseBody getBody() {
        return this.body;
    }

}
