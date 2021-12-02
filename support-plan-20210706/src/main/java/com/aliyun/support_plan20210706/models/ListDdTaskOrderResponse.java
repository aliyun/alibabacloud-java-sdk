// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class ListDdTaskOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDdTaskOrderResponseBody body;

    public static ListDdTaskOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDdTaskOrderResponse self = new ListDdTaskOrderResponse();
        return TeaModel.build(map, self);
    }

    public ListDdTaskOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDdTaskOrderResponse setBody(ListDdTaskOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDdTaskOrderResponseBody getBody() {
        return this.body;
    }

}
