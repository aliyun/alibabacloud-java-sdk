// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class GetVpcPeerConnectionAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVpcPeerConnectionAttributeResponseBody body;

    public static GetVpcPeerConnectionAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVpcPeerConnectionAttributeResponse self = new GetVpcPeerConnectionAttributeResponse();
        return TeaModel.build(map, self);
    }

    public GetVpcPeerConnectionAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVpcPeerConnectionAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVpcPeerConnectionAttributeResponse setBody(GetVpcPeerConnectionAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVpcPeerConnectionAttributeResponseBody getBody() {
        return this.body;
    }

}
