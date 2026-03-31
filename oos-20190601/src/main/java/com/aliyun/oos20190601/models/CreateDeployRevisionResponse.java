// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateDeployRevisionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDeployRevisionResponseBody body;

    public static CreateDeployRevisionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeployRevisionResponse self = new CreateDeployRevisionResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeployRevisionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDeployRevisionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDeployRevisionResponse setBody(CreateDeployRevisionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDeployRevisionResponseBody getBody() {
        return this.body;
    }

}
