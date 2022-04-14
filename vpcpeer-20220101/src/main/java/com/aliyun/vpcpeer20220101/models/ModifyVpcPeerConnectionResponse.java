// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class ModifyVpcPeerConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyVpcPeerConnectionResponseBody body;

    public static ModifyVpcPeerConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcPeerConnectionResponse self = new ModifyVpcPeerConnectionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVpcPeerConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVpcPeerConnectionResponse setBody(ModifyVpcPeerConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVpcPeerConnectionResponseBody getBody() {
        return this.body;
    }

}
