// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateCasLoadbalanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCasLoadbalanceResponseBody body;

    public static CreateCasLoadbalanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCasLoadbalanceResponse self = new CreateCasLoadbalanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateCasLoadbalanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCasLoadbalanceResponse setBody(CreateCasLoadbalanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCasLoadbalanceResponseBody getBody() {
        return this.body;
    }

}
