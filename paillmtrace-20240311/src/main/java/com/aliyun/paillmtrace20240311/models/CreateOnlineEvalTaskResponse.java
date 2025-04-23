// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class CreateOnlineEvalTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOnlineEvalTaskResponseBody body;

    public static CreateOnlineEvalTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOnlineEvalTaskResponse self = new CreateOnlineEvalTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateOnlineEvalTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOnlineEvalTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOnlineEvalTaskResponse setBody(CreateOnlineEvalTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOnlineEvalTaskResponseBody getBody() {
        return this.body;
    }

}
