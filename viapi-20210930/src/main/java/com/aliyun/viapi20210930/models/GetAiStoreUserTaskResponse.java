// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class GetAiStoreUserTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAiStoreUserTaskResponseBody body;

    public static GetAiStoreUserTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAiStoreUserTaskResponse self = new GetAiStoreUserTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetAiStoreUserTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAiStoreUserTaskResponse setBody(GetAiStoreUserTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAiStoreUserTaskResponseBody getBody() {
        return this.body;
    }

}
