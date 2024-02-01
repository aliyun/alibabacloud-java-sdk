// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteNetworkAclResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteNetworkAclResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNetworkAclResponse setBody(DeleteNetworkAclResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNetworkAclResponseBody getBody() {
        return this.body;
    }

}
