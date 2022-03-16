// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smart_subtitle20201217.models;

import com.aliyun.tea.*;

public class AddGameVideoTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddGameVideoTaskResponseBody body;

    public static AddGameVideoTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGameVideoTaskResponse self = new AddGameVideoTaskResponse();
        return TeaModel.build(map, self);
    }

    public AddGameVideoTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddGameVideoTaskResponse setBody(AddGameVideoTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGameVideoTaskResponseBody getBody() {
        return this.body;
    }

}
