// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class SubscribePbcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubscribePbcResponseBody body;

    public static SubscribePbcResponse build(java.util.Map<String, ?> map) throws Exception {
        SubscribePbcResponse self = new SubscribePbcResponse();
        return TeaModel.build(map, self);
    }

    public SubscribePbcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubscribePbcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubscribePbcResponse setBody(SubscribePbcResponseBody body) {
        this.body = body;
        return this;
    }
    public SubscribePbcResponseBody getBody() {
        return this.body;
    }

}
