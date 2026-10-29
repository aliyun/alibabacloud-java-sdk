// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.saf20190521.models;

import com.aliyun.tea.*;

public class RequestDecisionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RequestDecisionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RequestDecisionResponse setBody(RequestDecisionResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestDecisionResponseBody getBody() {
        return this.body;
    }

}
