// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetPdpServiceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PdpServiceGroupDetail body;

    public static GetPdpServiceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPdpServiceGroupResponse self = new GetPdpServiceGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetPdpServiceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPdpServiceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPdpServiceGroupResponse setBody(PdpServiceGroupDetail body) {
        this.body = body;
        return this;
    }
    public PdpServiceGroupDetail getBody() {
        return this.body;
    }

}
