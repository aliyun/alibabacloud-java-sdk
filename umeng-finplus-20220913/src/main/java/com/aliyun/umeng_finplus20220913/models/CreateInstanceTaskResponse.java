// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class CreateInstanceTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateInstanceTaskResponseBody body;

    public static CreateInstanceTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceTaskResponse self = new CreateInstanceTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateInstanceTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInstanceTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInstanceTaskResponse setBody(CreateInstanceTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstanceTaskResponseBody getBody() {
        return this.body;
    }

}
