// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class UpdateAiStoreUserTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateAiStoreUserTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAiStoreUserTaskResponse setBody(UpdateAiStoreUserTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAiStoreUserTaskResponseBody getBody() {
        return this.body;
    }

}
