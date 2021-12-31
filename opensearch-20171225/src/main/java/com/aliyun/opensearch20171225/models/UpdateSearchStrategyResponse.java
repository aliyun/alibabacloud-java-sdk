// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateSearchStrategyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateSearchStrategyResponse setBody(UpdateSearchStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSearchStrategyResponseBody getBody() {
        return this.body;
    }

}
