// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class AssociateResourceShareResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AssociateResourceShareResponseBody body;

    public static AssociateResourceShareResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateResourceShareResponse self = new AssociateResourceShareResponse();
        return TeaModel.build(map, self);
    }

    public AssociateResourceShareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateResourceShareResponse setBody(AssociateResourceShareResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateResourceShareResponseBody getBody() {
        return this.body;
    }

}
