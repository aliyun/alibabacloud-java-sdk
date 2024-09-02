// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetSearchStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSearchStrategyResponseBody body;

    public static GetSearchStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSearchStrategyResponse self = new GetSearchStrategyResponse();
        return TeaModel.build(map, self);
    }

    public GetSearchStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSearchStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSearchStrategyResponse setBody(GetSearchStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSearchStrategyResponseBody getBody() {
        return this.body;
    }

}
