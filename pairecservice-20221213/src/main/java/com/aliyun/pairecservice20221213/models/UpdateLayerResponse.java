// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateLayerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLayerResponseBody body;

    public static UpdateLayerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLayerResponse self = new UpdateLayerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLayerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLayerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLayerResponse setBody(UpdateLayerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLayerResponseBody getBody() {
        return this.body;
    }

}
