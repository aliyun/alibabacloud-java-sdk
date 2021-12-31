// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateSearchStrategyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateSearchStrategyResponse setBody(CreateSearchStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSearchStrategyResponseBody getBody() {
        return this.body;
    }

}
