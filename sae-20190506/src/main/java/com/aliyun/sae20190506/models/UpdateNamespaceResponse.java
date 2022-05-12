// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateNamespaceResponseBody body;

    public static UpdateNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNamespaceResponse self = new UpdateNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNamespaceResponse setBody(UpdateNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNamespaceResponseBody getBody() {
        return this.body;
    }

}
