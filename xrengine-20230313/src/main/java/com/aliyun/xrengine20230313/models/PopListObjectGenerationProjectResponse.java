// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopListObjectGenerationProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PopListObjectGenerationProjectResponseBody body;

    public static PopListObjectGenerationProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        PopListObjectGenerationProjectResponse self = new PopListObjectGenerationProjectResponse();
        return TeaModel.build(map, self);
    }

    public PopListObjectGenerationProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopListObjectGenerationProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopListObjectGenerationProjectResponse setBody(PopListObjectGenerationProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public PopListObjectGenerationProjectResponseBody getBody() {
        return this.body;
    }

}
