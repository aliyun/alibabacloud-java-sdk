// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CreateTrademarkOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTrademarkOrderResponseBody body;

    public static CreateTrademarkOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTrademarkOrderResponse self = new CreateTrademarkOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateTrademarkOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTrademarkOrderResponse setBody(CreateTrademarkOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTrademarkOrderResponseBody getBody() {
        return this.body;
    }

}
