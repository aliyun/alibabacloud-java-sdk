// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class UpdateTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTaskResponseBody body;

    public static UpdateTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskResponse self = new UpdateTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTaskResponse setBody(UpdateTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTaskResponseBody getBody() {
        return this.body;
    }

}
