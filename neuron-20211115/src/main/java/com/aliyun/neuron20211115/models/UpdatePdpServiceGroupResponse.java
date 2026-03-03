// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdatePdpServiceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PdpServiceGroup body;

    public static UpdatePdpServiceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePdpServiceGroupResponse self = new UpdatePdpServiceGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePdpServiceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePdpServiceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePdpServiceGroupResponse setBody(PdpServiceGroup body) {
        this.body = body;
        return this;
    }
    public PdpServiceGroup getBody() {
        return this.body;
    }

}
