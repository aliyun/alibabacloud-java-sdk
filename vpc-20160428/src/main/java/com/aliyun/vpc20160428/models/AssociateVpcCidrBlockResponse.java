// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateVpcCidrBlockResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AssociateVpcCidrBlockResponseBody body;

    public static AssociateVpcCidrBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateVpcCidrBlockResponse self = new AssociateVpcCidrBlockResponse();
        return TeaModel.build(map, self);
    }

    public AssociateVpcCidrBlockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateVpcCidrBlockResponse setBody(AssociateVpcCidrBlockResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateVpcCidrBlockResponseBody getBody() {
        return this.body;
    }

}
