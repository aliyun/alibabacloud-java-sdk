// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetPdpServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PdpService body;

    public static GetPdpServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPdpServiceResponse self = new GetPdpServiceResponse();
        return TeaModel.build(map, self);
    }

    public GetPdpServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPdpServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPdpServiceResponse setBody(PdpService body) {
        this.body = body;
        return this;
    }
    public PdpService getBody() {
        return this.body;
    }

}
