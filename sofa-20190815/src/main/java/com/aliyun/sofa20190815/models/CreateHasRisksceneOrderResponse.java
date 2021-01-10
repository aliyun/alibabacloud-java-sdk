// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasRisksceneOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHasRisksceneOrderResponseBody body;

    public static CreateHasRisksceneOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHasRisksceneOrderResponse self = new CreateHasRisksceneOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateHasRisksceneOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHasRisksceneOrderResponse setBody(CreateHasRisksceneOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHasRisksceneOrderResponseBody getBody() {
        return this.body;
    }

}
