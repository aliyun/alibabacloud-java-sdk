// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateExecutionResponseBody body;

    public static UpdateExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExecutionResponse self = new UpdateExecutionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateExecutionResponse setBody(UpdateExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExecutionResponseBody getBody() {
        return this.body;
    }

}
