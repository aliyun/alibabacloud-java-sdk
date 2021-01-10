// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateCasComputerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCasComputerResponseBody body;

    public static CreateCasComputerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCasComputerResponse self = new CreateCasComputerResponse();
        return TeaModel.build(map, self);
    }

    public CreateCasComputerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCasComputerResponse setBody(CreateCasComputerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCasComputerResponseBody getBody() {
        return this.body;
    }

}
