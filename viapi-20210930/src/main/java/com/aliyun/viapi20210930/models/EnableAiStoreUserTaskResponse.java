// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class EnableAiStoreUserTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableAiStoreUserTaskResponseBody body;

    public static EnableAiStoreUserTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableAiStoreUserTaskResponse self = new EnableAiStoreUserTaskResponse();
        return TeaModel.build(map, self);
    }

    public EnableAiStoreUserTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableAiStoreUserTaskResponse setBody(EnableAiStoreUserTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableAiStoreUserTaskResponseBody getBody() {
        return this.body;
    }

}
