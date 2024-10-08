// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateSearchStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSearchStrategyResponseBody body;

    public static UpdateSearchStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSearchStrategyResponse self = new UpdateSearchStrategyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSearchStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSearchStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSearchStrategyResponse setBody(UpdateSearchStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSearchStrategyResponseBody getBody() {
        return this.body;
    }

}
