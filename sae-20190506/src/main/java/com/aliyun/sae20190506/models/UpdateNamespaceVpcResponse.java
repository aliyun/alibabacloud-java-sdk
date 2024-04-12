// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateNamespaceVpcResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateNamespaceVpcResponseBody body;

    public static UpdateNamespaceVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNamespaceVpcResponse self = new UpdateNamespaceVpcResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNamespaceVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNamespaceVpcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNamespaceVpcResponse setBody(UpdateNamespaceVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNamespaceVpcResponseBody getBody() {
        return this.body;
    }

}
