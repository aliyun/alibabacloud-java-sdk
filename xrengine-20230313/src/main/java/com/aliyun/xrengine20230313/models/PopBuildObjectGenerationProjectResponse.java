// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopBuildObjectGenerationProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PopBuildObjectGenerationProjectResponseBody body;

    public static PopBuildObjectGenerationProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        PopBuildObjectGenerationProjectResponse self = new PopBuildObjectGenerationProjectResponse();
        return TeaModel.build(map, self);
    }

    public PopBuildObjectGenerationProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopBuildObjectGenerationProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopBuildObjectGenerationProjectResponse setBody(PopBuildObjectGenerationProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public PopBuildObjectGenerationProjectResponseBody getBody() {
        return this.body;
    }

}
