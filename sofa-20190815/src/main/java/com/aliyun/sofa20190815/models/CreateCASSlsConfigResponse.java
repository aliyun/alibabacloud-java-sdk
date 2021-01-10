// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateCASSlsConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCASSlsConfigResponseBody body;

    public static CreateCASSlsConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCASSlsConfigResponse self = new CreateCASSlsConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateCASSlsConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCASSlsConfigResponse setBody(CreateCASSlsConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCASSlsConfigResponseBody getBody() {
        return this.body;
    }

}
