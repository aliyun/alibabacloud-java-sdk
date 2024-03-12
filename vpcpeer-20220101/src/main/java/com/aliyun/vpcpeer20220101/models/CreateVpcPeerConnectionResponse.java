// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class CreateVpcPeerConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVpcPeerConnectionResponseBody body;

    public static CreateVpcPeerConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcPeerConnectionResponse self = new CreateVpcPeerConnectionResponse();
        return TeaModel.build(map, self);
    }

    public CreateVpcPeerConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVpcPeerConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVpcPeerConnectionResponse setBody(CreateVpcPeerConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVpcPeerConnectionResponseBody getBody() {
        return this.body;
    }

}
