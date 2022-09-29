// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdatePdpPbcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePdpPbcResponseBody body;

    public static UpdatePdpPbcResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePdpPbcResponse self = new UpdatePdpPbcResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePdpPbcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePdpPbcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePdpPbcResponse setBody(UpdatePdpPbcResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePdpPbcResponseBody getBody() {
        return this.body;
    }

}
