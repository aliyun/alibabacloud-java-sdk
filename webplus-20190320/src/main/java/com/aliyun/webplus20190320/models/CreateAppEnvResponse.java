// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class CreateAppEnvResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAppEnvResponseBody body;

    public static CreateAppEnvResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppEnvResponse self = new CreateAppEnvResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppEnvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppEnvResponse setBody(CreateAppEnvResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppEnvResponseBody getBody() {
        return this.body;
    }

}
