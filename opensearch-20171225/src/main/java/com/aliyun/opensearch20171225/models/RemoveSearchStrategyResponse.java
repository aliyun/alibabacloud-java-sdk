// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RemoveSearchStrategyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveSearchStrategyResponseBody body;

    public static RemoveSearchStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveSearchStrategyResponse self = new RemoveSearchStrategyResponse();
        return TeaModel.build(map, self);
    }

    public RemoveSearchStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveSearchStrategyResponse setBody(RemoveSearchStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveSearchStrategyResponseBody getBody() {
        return this.body;
    }

}
