// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdatePdpConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PdpConfig body;

    public static UpdatePdpConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePdpConfigResponse self = new UpdatePdpConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePdpConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePdpConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePdpConfigResponse setBody(PdpConfig body) {
        this.body = body;
        return this;
    }
    public PdpConfig getBody() {
        return this.body;
    }

}
