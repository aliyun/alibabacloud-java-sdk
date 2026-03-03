// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePdpServiceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PdpServiceGroup body;

    public static CreatePdpServiceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePdpServiceGroupResponse self = new CreatePdpServiceGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreatePdpServiceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePdpServiceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePdpServiceGroupResponse setBody(PdpServiceGroup body) {
        this.body = body;
        return this;
    }
    public PdpServiceGroup getBody() {
        return this.body;
    }

}
