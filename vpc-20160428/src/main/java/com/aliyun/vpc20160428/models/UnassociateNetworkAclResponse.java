// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UnassociateNetworkAclResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnassociateNetworkAclResponseBody body;

    public static UnassociateNetworkAclResponse build(java.util.Map<String, ?> map) throws Exception {
        UnassociateNetworkAclResponse self = new UnassociateNetworkAclResponse();
        return TeaModel.build(map, self);
    }

    public UnassociateNetworkAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnassociateNetworkAclResponse setBody(UnassociateNetworkAclResponseBody body) {
        this.body = body;
        return this;
    }
    public UnassociateNetworkAclResponseBody getBody() {
        return this.body;
    }

}
