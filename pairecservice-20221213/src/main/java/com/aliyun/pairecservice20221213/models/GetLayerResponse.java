// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetLayerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLayerResponseBody body;

    public static GetLayerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLayerResponse self = new GetLayerResponse();
        return TeaModel.build(map, self);
    }

    public GetLayerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLayerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLayerResponse setBody(GetLayerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLayerResponseBody getBody() {
        return this.body;
    }

}
