// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktRiskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeLinktRiskResponseBody body;

    public static CreateLinkeLinktRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktRiskResponse self = new CreateLinkeLinktRiskResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktRiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeLinktRiskResponse setBody(CreateLinkeLinktRiskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeLinktRiskResponseBody getBody() {
        return this.body;
    }

}
