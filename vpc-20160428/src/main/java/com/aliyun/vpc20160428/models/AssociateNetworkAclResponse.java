// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateNetworkAclResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateNetworkAclResponseBody body;

    public static AssociateNetworkAclResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateNetworkAclResponse self = new AssociateNetworkAclResponse();
        return TeaModel.build(map, self);
    }

    public AssociateNetworkAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateNetworkAclResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateNetworkAclResponse setBody(AssociateNetworkAclResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateNetworkAclResponseBody getBody() {
        return this.body;
    }

}
