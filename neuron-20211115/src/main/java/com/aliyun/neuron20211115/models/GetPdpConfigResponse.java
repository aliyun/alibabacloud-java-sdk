// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetPdpConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PdpConfig body;

    public static GetPdpConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPdpConfigResponse self = new GetPdpConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetPdpConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPdpConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPdpConfigResponse setBody(PdpConfig body) {
        this.body = body;
        return this;
    }
    public PdpConfig getBody() {
        return this.body;
    }

}
