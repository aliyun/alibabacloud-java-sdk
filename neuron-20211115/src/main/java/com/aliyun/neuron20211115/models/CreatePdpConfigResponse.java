// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePdpConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PdpConfig body;

    public static CreatePdpConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePdpConfigResponse self = new CreatePdpConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreatePdpConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePdpConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePdpConfigResponse setBody(PdpConfig body) {
        this.body = body;
        return this;
    }
    public PdpConfig getBody() {
        return this.body;
    }

}
