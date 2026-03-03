// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePdpPbcResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PdpPbc body;

    public static CreatePdpPbcResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePdpPbcResponse self = new CreatePdpPbcResponse();
        return TeaModel.build(map, self);
    }

    public CreatePdpPbcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePdpPbcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePdpPbcResponse setBody(PdpPbc body) {
        this.body = body;
        return this;
    }
    public PdpPbc getBody() {
        return this.body;
    }

}
