// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class RejectVpcPeerConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RejectVpcPeerConnectionResponseBody body;

    public static RejectVpcPeerConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        RejectVpcPeerConnectionResponse self = new RejectVpcPeerConnectionResponse();
        return TeaModel.build(map, self);
    }

    public RejectVpcPeerConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RejectVpcPeerConnectionResponse setBody(RejectVpcPeerConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public RejectVpcPeerConnectionResponseBody getBody() {
        return this.body;
    }

}
