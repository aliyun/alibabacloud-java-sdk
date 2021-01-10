// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DisableSlowQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableSlowQueryResponseBody body;

    public static DisableSlowQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableSlowQueryResponse self = new DisableSlowQueryResponse();
        return TeaModel.build(map, self);
    }

    public DisableSlowQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableSlowQueryResponse setBody(DisableSlowQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableSlowQueryResponseBody getBody() {
        return this.body;
    }

}
