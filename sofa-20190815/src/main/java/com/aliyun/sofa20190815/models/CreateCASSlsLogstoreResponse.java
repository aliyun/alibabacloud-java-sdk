// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateCASSlsLogstoreResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCASSlsLogstoreResponseBody body;

    public static CreateCASSlsLogstoreResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCASSlsLogstoreResponse self = new CreateCASSlsLogstoreResponse();
        return TeaModel.build(map, self);
    }

    public CreateCASSlsLogstoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCASSlsLogstoreResponse setBody(CreateCASSlsLogstoreResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCASSlsLogstoreResponseBody getBody() {
        return this.body;
    }

}
