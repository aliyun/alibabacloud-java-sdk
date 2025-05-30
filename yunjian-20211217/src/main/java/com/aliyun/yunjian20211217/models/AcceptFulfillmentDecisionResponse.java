// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class AcceptFulfillmentDecisionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AcceptFulfillmentDecisionResponseBody body;

    public static AcceptFulfillmentDecisionResponse build(java.util.Map<String, ?> map) throws Exception {
        AcceptFulfillmentDecisionResponse self = new AcceptFulfillmentDecisionResponse();
        return TeaModel.build(map, self);
    }

    public AcceptFulfillmentDecisionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AcceptFulfillmentDecisionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AcceptFulfillmentDecisionResponse setBody(AcceptFulfillmentDecisionResponseBody body) {
        this.body = body;
        return this;
    }
    public AcceptFulfillmentDecisionResponseBody getBody() {
        return this.body;
    }

}
