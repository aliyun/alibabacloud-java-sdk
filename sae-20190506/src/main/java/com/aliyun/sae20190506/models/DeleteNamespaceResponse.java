// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNamespaceResponseBody body;

    public static DeleteNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNamespaceResponse self = new DeleteNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNamespaceResponse setBody(DeleteNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNamespaceResponseBody getBody() {
        return this.body;
    }

}
