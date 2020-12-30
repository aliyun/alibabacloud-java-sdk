// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class AddConsumerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddConsumerResponseBody body;

    public static AddConsumerResponse build(java.util.Map<String, ?> map) throws Exception {
        AddConsumerResponse self = new AddConsumerResponse();
        return TeaModel.build(map, self);
    }

    public AddConsumerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddConsumerResponse setBody(AddConsumerResponseBody body) {
        this.body = body;
        return this;
    }
    public AddConsumerResponseBody getBody() {
        return this.body;
    }

}
