// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateClogServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateClogServiceResponseBody body;

    public static CreateClogServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateClogServiceResponse self = new CreateClogServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateClogServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateClogServiceResponse setBody(CreateClogServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateClogServiceResponseBody getBody() {
        return this.body;
    }

}
