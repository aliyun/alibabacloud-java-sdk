// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class ListDdTaskOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListDdTaskOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDdTaskOrderResponse setBody(ListDdTaskOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDdTaskOrderResponseBody getBody() {
        return this.body;
    }

}
