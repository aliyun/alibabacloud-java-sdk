// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AssociateACLResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AssociateACLResponseBody body;

    public static AssociateACLResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateACLResponse self = new AssociateACLResponse();
        return TeaModel.build(map, self);
    }

    public AssociateACLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateACLResponse setBody(AssociateACLResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateACLResponseBody getBody() {
        return this.body;
    }

}
