// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class EnableSlowQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableSlowQueryResponseBody body;

    public static EnableSlowQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableSlowQueryResponse self = new EnableSlowQueryResponse();
        return TeaModel.build(map, self);
    }

    public EnableSlowQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableSlowQueryResponse setBody(EnableSlowQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableSlowQueryResponseBody getBody() {
        return this.body;
    }

}
