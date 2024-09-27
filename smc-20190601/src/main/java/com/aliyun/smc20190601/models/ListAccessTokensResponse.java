// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class ListAccessTokensResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAccessTokensResponseBody body;

    public static ListAccessTokensResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccessTokensResponse self = new ListAccessTokensResponse();
        return TeaModel.build(map, self);
    }

    public ListAccessTokensResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAccessTokensResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAccessTokensResponse setBody(ListAccessTokensResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccessTokensResponseBody getBody() {
        return this.body;
    }

}
