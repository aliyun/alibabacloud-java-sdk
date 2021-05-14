// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateSasOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSasOrderResponseBody body;

    public static CreateSasOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSasOrderResponse self = new CreateSasOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateSasOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSasOrderResponse setBody(CreateSasOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSasOrderResponseBody getBody() {
        return this.body;
    }

}
