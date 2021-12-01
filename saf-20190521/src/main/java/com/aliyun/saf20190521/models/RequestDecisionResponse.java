// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.saf20190521.models;

import com.aliyun.tea.*;

public class RequestDecisionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RequestDecisionResponseBody body;

    public static RequestDecisionResponse build(java.util.Map<String, ?> map) throws Exception {
        RequestDecisionResponse self = new RequestDecisionResponse();
        return TeaModel.build(map, self);
    }

    public RequestDecisionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RequestDecisionResponse setBody(RequestDecisionResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestDecisionResponseBody getBody() {
        return this.body;
    }

}
