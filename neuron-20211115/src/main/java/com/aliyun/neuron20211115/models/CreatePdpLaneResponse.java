// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePdpLaneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PdpLane body;

    public static CreatePdpLaneResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePdpLaneResponse self = new CreatePdpLaneResponse();
        return TeaModel.build(map, self);
    }

    public CreatePdpLaneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePdpLaneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePdpLaneResponse setBody(PdpLane body) {
        this.body = body;
        return this;
    }
    public PdpLane getBody() {
        return this.body;
    }

}
