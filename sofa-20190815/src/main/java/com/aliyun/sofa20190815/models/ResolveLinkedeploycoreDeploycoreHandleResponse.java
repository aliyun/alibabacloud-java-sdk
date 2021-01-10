// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ResolveLinkedeploycoreDeploycoreHandleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResolveLinkedeploycoreDeploycoreHandleResponseBody body;

    public static ResolveLinkedeploycoreDeploycoreHandleResponse build(java.util.Map<String, ?> map) throws Exception {
        ResolveLinkedeploycoreDeploycoreHandleResponse self = new ResolveLinkedeploycoreDeploycoreHandleResponse();
        return TeaModel.build(map, self);
    }

    public ResolveLinkedeploycoreDeploycoreHandleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResolveLinkedeploycoreDeploycoreHandleResponse setBody(ResolveLinkedeploycoreDeploycoreHandleResponseBody body) {
        this.body = body;
        return this;
    }
    public ResolveLinkedeploycoreDeploycoreHandleResponseBody getBody() {
        return this.body;
    }

}
