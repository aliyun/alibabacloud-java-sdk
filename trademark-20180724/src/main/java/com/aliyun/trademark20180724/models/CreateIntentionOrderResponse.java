// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CreateIntentionOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateIntentionOrderResponseBody body;

    public static CreateIntentionOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIntentionOrderResponse self = new CreateIntentionOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateIntentionOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIntentionOrderResponse setBody(CreateIntentionOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIntentionOrderResponseBody getBody() {
        return this.body;
    }

}
