// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UnassociateVpcCidrBlockResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnassociateVpcCidrBlockResponseBody body;

    public static UnassociateVpcCidrBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        UnassociateVpcCidrBlockResponse self = new UnassociateVpcCidrBlockResponse();
        return TeaModel.build(map, self);
    }

    public UnassociateVpcCidrBlockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnassociateVpcCidrBlockResponse setBody(UnassociateVpcCidrBlockResponseBody body) {
        this.body = body;
        return this;
    }
    public UnassociateVpcCidrBlockResponseBody getBody() {
        return this.body;
    }

}
