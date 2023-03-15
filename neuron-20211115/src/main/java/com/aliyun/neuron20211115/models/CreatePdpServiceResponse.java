// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePdpServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PdpService body;

    public static CreatePdpServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePdpServiceResponse self = new CreatePdpServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreatePdpServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePdpServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePdpServiceResponse setBody(PdpService body) {
        this.body = body;
        return this;
    }
    public PdpService getBody() {
        return this.body;
    }

}
