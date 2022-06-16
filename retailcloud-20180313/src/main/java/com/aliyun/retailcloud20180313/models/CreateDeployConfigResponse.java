// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreateDeployConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDeployConfigResponseBody body;

    public static CreateDeployConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeployConfigResponse self = new CreateDeployConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeployConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDeployConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDeployConfigResponse setBody(CreateDeployConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDeployConfigResponseBody getBody() {
        return this.body;
    }

}
