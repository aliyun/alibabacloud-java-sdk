// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class AddSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddSceneResponseBody body;

    public static AddSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSceneResponse self = new AddSceneResponse();
        return TeaModel.build(map, self);
    }

    public AddSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSceneResponse setBody(AddSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSceneResponseBody getBody() {
        return this.body;
    }

}
