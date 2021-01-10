// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateCasDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCasDatabaseResponseBody body;

    public static CreateCasDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCasDatabaseResponse self = new CreateCasDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public CreateCasDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCasDatabaseResponse setBody(CreateCasDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCasDatabaseResponseBody getBody() {
        return this.body;
    }

}
