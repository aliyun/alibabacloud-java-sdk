// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class CreateTaskOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTaskOrderResponseBody body;

    public static CreateTaskOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskOrderResponse self = new CreateTaskOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateTaskOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTaskOrderResponse setBody(CreateTaskOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTaskOrderResponseBody getBody() {
        return this.body;
    }

}
