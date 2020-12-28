// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsConsumerAccumulateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsConsumerAccumulateResponseBody body;

    public static OnsConsumerAccumulateResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsConsumerAccumulateResponse self = new OnsConsumerAccumulateResponse();
        return TeaModel.build(map, self);
    }

    public OnsConsumerAccumulateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsConsumerAccumulateResponse setBody(OnsConsumerAccumulateResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsConsumerAccumulateResponseBody getBody() {
        return this.body;
    }

}
