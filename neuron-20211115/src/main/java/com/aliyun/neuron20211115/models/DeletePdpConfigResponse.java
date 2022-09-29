// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DeletePdpConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePdpConfigResponseBody body;

    public static DeletePdpConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePdpConfigResponse self = new DeletePdpConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeletePdpConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePdpConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePdpConfigResponse setBody(DeletePdpConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePdpConfigResponseBody getBody() {
        return this.body;
    }

}
