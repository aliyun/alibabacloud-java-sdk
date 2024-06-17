// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetIndexOnlineStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIndexOnlineStrategyResponseBody body;

    public static GetIndexOnlineStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIndexOnlineStrategyResponse self = new GetIndexOnlineStrategyResponse();
        return TeaModel.build(map, self);
    }

    public GetIndexOnlineStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIndexOnlineStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIndexOnlineStrategyResponse setBody(GetIndexOnlineStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIndexOnlineStrategyResponseBody getBody() {
        return this.body;
    }

}
