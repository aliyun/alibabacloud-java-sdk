// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteNetworkAclResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteNetworkAclResponseBody body;

    public static DeleteNetworkAclResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkAclResponse self = new DeleteNetworkAclResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNetworkAclResponse setBody(DeleteNetworkAclResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNetworkAclResponseBody getBody() {
        return this.body;
    }

}
