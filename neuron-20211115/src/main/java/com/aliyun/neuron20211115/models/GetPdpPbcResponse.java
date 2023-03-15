// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetPdpPbcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PdpPbc body;

    public static GetPdpPbcResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPdpPbcResponse self = new GetPdpPbcResponse();
        return TeaModel.build(map, self);
    }

    public GetPdpPbcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPdpPbcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPdpPbcResponse setBody(PdpPbc body) {
        this.body = body;
        return this;
    }
    public PdpPbc getBody() {
        return this.body;
    }

}
