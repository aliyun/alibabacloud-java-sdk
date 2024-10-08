// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateSearchStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSearchStrategyResponseBody body;

    public static CreateSearchStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSearchStrategyResponse self = new CreateSearchStrategyResponse();
        return TeaModel.build(map, self);
    }

    public CreateSearchStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSearchStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSearchStrategyResponse setBody(CreateSearchStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSearchStrategyResponseBody getBody() {
        return this.body;
    }

}
