// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopCreateObjectGenerationProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PopCreateObjectGenerationProjectResponseBody body;

    public static PopCreateObjectGenerationProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        PopCreateObjectGenerationProjectResponse self = new PopCreateObjectGenerationProjectResponse();
        return TeaModel.build(map, self);
    }

    public PopCreateObjectGenerationProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopCreateObjectGenerationProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopCreateObjectGenerationProjectResponse setBody(PopCreateObjectGenerationProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public PopCreateObjectGenerationProjectResponseBody getBody() {
        return this.body;
    }

}
