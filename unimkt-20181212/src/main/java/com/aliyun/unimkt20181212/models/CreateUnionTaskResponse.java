// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class CreateUnionTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateUnionTaskResponseBody body;

    public static CreateUnionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUnionTaskResponse self = new CreateUnionTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateUnionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUnionTaskResponse setBody(CreateUnionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUnionTaskResponseBody getBody() {
        return this.body;
    }

}
