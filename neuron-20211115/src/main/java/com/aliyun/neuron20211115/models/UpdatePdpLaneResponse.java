// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdatePdpLaneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PdpLane body;

    public static UpdatePdpLaneResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePdpLaneResponse self = new UpdatePdpLaneResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePdpLaneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePdpLaneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePdpLaneResponse setBody(PdpLane body) {
        this.body = body;
        return this;
    }
    public PdpLane getBody() {
        return this.body;
    }

}
