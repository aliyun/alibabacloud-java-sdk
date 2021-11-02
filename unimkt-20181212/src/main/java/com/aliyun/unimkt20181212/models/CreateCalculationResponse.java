// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class CreateCalculationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCalculationResponseBody body;

    public static CreateCalculationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCalculationResponse self = new CreateCalculationResponse();
        return TeaModel.build(map, self);
    }

    public CreateCalculationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCalculationResponse setBody(CreateCalculationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCalculationResponseBody getBody() {
        return this.body;
    }

}
