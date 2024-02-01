// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateNetworkAclResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateNetworkAclResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNetworkAclResponse setBody(CreateNetworkAclResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNetworkAclResponseBody getBody() {
        return this.body;
    }

}
