// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class DeleteAiStoreUserTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteAiStoreUserTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAiStoreUserTaskResponse setBody(DeleteAiStoreUserTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAiStoreUserTaskResponseBody getBody() {
        return this.body;
    }

}
