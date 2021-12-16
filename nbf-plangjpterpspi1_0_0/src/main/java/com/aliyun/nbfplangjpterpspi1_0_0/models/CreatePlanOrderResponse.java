// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbfplangjpterpspi1_0_0.models;

import com.aliyun.tea.*;

public class CreatePlanOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePlanOrderResponseBody body;

    public static CreatePlanOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePlanOrderResponse self = new CreatePlanOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreatePlanOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePlanOrderResponse setBody(CreatePlanOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePlanOrderResponseBody getBody() {
        return this.body;
    }

}
