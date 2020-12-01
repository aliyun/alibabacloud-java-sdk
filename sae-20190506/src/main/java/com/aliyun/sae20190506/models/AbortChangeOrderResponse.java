// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class AbortChangeOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AbortChangeOrderResponseBody body;

    public static AbortChangeOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        AbortChangeOrderResponse self = new AbortChangeOrderResponse();
        return TeaModel.build(map, self);
    }

    public AbortChangeOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AbortChangeOrderResponse setBody(AbortChangeOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public AbortChangeOrderResponseBody getBody() {
        return this.body;
    }

}
