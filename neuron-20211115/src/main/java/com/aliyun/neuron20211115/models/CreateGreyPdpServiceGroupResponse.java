// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateGreyPdpServiceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PdpServiceGroup body;

    public static CreateGreyPdpServiceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGreyPdpServiceGroupResponse self = new CreateGreyPdpServiceGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateGreyPdpServiceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGreyPdpServiceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGreyPdpServiceGroupResponse setBody(PdpServiceGroup body) {
        this.body = body;
        return this;
    }
    public PdpServiceGroup getBody() {
        return this.body;
    }

}
