// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDWSSubsTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDWSSubsTaskResponseBody body;

    public static CreateDWSSubsTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDWSSubsTaskResponse self = new CreateDWSSubsTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDWSSubsTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDWSSubsTaskResponse setBody(CreateDWSSubsTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDWSSubsTaskResponseBody getBody() {
        return this.body;
    }

}
