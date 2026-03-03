// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdatePdpServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PdpService body;

    public static UpdatePdpServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePdpServiceResponse self = new UpdatePdpServiceResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePdpServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePdpServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePdpServiceResponse setBody(PdpService body) {
        this.body = body;
        return this;
    }
    public PdpService getBody() {
        return this.body;
    }

}
