// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class DeleteVpcPeerConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVpcPeerConnectionResponseBody body;

    public static DeleteVpcPeerConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcPeerConnectionResponse self = new DeleteVpcPeerConnectionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVpcPeerConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVpcPeerConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVpcPeerConnectionResponse setBody(DeleteVpcPeerConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVpcPeerConnectionResponseBody getBody() {
        return this.body;
    }

}
