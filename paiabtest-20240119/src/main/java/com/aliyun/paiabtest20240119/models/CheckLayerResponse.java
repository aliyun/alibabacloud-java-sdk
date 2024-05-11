// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class CheckLayerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckLayerResponseBody body;

    public static CheckLayerResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLayerResponse self = new CheckLayerResponse();
        return TeaModel.build(map, self);
    }

    public CheckLayerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLayerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckLayerResponse setBody(CheckLayerResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLayerResponseBody getBody() {
        return this.body;
    }

}
