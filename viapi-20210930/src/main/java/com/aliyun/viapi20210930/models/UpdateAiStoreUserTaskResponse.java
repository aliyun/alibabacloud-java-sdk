// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class UpdateAiStoreUserTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAiStoreUserTaskResponseBody body;

    public static UpdateAiStoreUserTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiStoreUserTaskResponse self = new UpdateAiStoreUserTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAiStoreUserTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAiStoreUserTaskResponse setBody(UpdateAiStoreUserTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAiStoreUserTaskResponseBody getBody() {
        return this.body;
    }

}
