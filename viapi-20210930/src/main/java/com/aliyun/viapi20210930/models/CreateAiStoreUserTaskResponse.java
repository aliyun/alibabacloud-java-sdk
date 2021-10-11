// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class CreateAiStoreUserTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAiStoreUserTaskResponseBody body;

    public static CreateAiStoreUserTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAiStoreUserTaskResponse self = new CreateAiStoreUserTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateAiStoreUserTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAiStoreUserTaskResponse setBody(CreateAiStoreUserTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAiStoreUserTaskResponseBody getBody() {
        return this.body;
    }

}
