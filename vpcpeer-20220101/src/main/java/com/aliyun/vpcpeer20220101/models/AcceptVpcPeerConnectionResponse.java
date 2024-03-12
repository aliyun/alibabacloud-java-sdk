// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class AcceptVpcPeerConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AcceptVpcPeerConnectionResponseBody body;

    public static AcceptVpcPeerConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        AcceptVpcPeerConnectionResponse self = new AcceptVpcPeerConnectionResponse();
        return TeaModel.build(map, self);
    }

    public AcceptVpcPeerConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AcceptVpcPeerConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AcceptVpcPeerConnectionResponse setBody(AcceptVpcPeerConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public AcceptVpcPeerConnectionResponseBody getBody() {
        return this.body;
    }

}
