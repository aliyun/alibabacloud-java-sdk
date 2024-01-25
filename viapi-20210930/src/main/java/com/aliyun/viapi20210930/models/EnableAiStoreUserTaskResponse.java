// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class EnableAiStoreUserTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public EnableAiStoreUserTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableAiStoreUserTaskResponse setBody(EnableAiStoreUserTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableAiStoreUserTaskResponseBody getBody() {
        return this.body;
    }

}
