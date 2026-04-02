// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class CreateTempFileTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTempFileTaskResponseBody body;

    public static CreateTempFileTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTempFileTaskResponse self = new CreateTempFileTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateTempFileTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTempFileTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTempFileTaskResponse setBody(CreateTempFileTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTempFileTaskResponseBody getBody() {
        return this.body;
    }

}
