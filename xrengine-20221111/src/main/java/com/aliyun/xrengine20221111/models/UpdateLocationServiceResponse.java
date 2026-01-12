// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class UpdateLocationServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLocationServiceResponseBody body;

    public static UpdateLocationServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLocationServiceResponse self = new UpdateLocationServiceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLocationServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLocationServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLocationServiceResponse setBody(UpdateLocationServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLocationServiceResponseBody getBody() {
        return this.body;
    }

}
