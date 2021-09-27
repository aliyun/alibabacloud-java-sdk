// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class CreateTensorboardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTensorboardResponseBody body;

    public static CreateTensorboardResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTensorboardResponse self = new CreateTensorboardResponse();
        return TeaModel.build(map, self);
    }

    public CreateTensorboardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTensorboardResponse setBody(CreateTensorboardResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTensorboardResponseBody getBody() {
        return this.body;
    }

}
