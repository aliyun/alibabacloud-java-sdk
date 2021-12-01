// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class RestOpenTaskOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RestOpenTaskOrderResponseBody body;

    public static RestOpenTaskOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        RestOpenTaskOrderResponse self = new RestOpenTaskOrderResponse();
        return TeaModel.build(map, self);
    }

    public RestOpenTaskOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestOpenTaskOrderResponse setBody(RestOpenTaskOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public RestOpenTaskOrderResponseBody getBody() {
        return this.body;
    }

}
