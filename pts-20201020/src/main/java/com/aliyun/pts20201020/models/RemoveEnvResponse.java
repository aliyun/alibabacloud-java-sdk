// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class RemoveEnvResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveEnvResponseBody body;

    public static RemoveEnvResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveEnvResponse self = new RemoveEnvResponse();
        return TeaModel.build(map, self);
    }

    public RemoveEnvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveEnvResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveEnvResponse setBody(RemoveEnvResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveEnvResponseBody getBody() {
        return this.body;
    }

}
