// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreateEciConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEciConfigResponseBody body;

    public static CreateEciConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEciConfigResponse self = new CreateEciConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateEciConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEciConfigResponse setBody(CreateEciConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEciConfigResponseBody getBody() {
        return this.body;
    }

}
