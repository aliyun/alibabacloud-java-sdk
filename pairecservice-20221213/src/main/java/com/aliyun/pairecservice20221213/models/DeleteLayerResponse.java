// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteLayerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLayerResponseBody body;

    public static DeleteLayerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLayerResponse self = new DeleteLayerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLayerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLayerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLayerResponse setBody(DeleteLayerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLayerResponseBody getBody() {
        return this.body;
    }

}
