// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateNetworkAclResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateNetworkAclResponseBody body;

    public static CreateNetworkAclResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkAclResponse self = new CreateNetworkAclResponse();
        return TeaModel.build(map, self);
    }

    public CreateNetworkAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNetworkAclResponse setBody(CreateNetworkAclResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNetworkAclResponseBody getBody() {
        return this.body;
    }

}
