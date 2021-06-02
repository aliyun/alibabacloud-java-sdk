// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class CreateSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSceneResponseBody body;

    public static CreateSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSceneResponse self = new CreateSceneResponse();
        return TeaModel.build(map, self);
    }

    public CreateSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSceneResponse setBody(CreateSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSceneResponseBody getBody() {
        return this.body;
    }

}
