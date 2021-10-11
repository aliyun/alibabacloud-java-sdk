// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class DeleteAiStoreUserTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAiStoreUserTaskResponseBody body;

    public static DeleteAiStoreUserTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAiStoreUserTaskResponse self = new DeleteAiStoreUserTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAiStoreUserTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAiStoreUserTaskResponse setBody(DeleteAiStoreUserTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAiStoreUserTaskResponseBody getBody() {
        return this.body;
    }

}
