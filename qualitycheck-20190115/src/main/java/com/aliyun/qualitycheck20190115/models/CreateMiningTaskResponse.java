// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateMiningTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMiningTaskResponseBody body;

    public static CreateMiningTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMiningTaskResponse self = new CreateMiningTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateMiningTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMiningTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMiningTaskResponse setBody(CreateMiningTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMiningTaskResponseBody getBody() {
        return this.body;
    }

}
