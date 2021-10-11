// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class DisableAiStoreUserTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableAiStoreUserTaskResponseBody body;

    public static DisableAiStoreUserTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableAiStoreUserTaskResponse self = new DisableAiStoreUserTaskResponse();
        return TeaModel.build(map, self);
    }

    public DisableAiStoreUserTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableAiStoreUserTaskResponse setBody(DisableAiStoreUserTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableAiStoreUserTaskResponseBody getBody() {
        return this.body;
    }

}
