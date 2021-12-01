// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class CloseTaskOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CloseTaskOrderResponseBody body;

    public static CloseTaskOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseTaskOrderResponse self = new CloseTaskOrderResponse();
        return TeaModel.build(map, self);
    }

    public CloseTaskOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseTaskOrderResponse setBody(CloseTaskOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseTaskOrderResponseBody getBody() {
        return this.body;
    }

}
