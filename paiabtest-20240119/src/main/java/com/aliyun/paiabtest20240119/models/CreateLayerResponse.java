// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class CreateLayerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLayerResponseBody body;

    public static CreateLayerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLayerResponse self = new CreateLayerResponse();
        return TeaModel.build(map, self);
    }

    public CreateLayerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLayerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLayerResponse setBody(CreateLayerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLayerResponseBody getBody() {
        return this.body;
    }

}
