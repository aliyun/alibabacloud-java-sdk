// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class DisableAiStoreUserTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DisableAiStoreUserTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableAiStoreUserTaskResponse setBody(DisableAiStoreUserTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableAiStoreUserTaskResponseBody getBody() {
        return this.body;
    }

}
