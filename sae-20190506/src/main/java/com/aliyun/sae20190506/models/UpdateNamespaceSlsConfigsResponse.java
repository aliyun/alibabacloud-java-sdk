// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateNamespaceSlsConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateNamespaceSlsConfigsResponseBody body;

    public static UpdateNamespaceSlsConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNamespaceSlsConfigsResponse self = new UpdateNamespaceSlsConfigsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNamespaceSlsConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNamespaceSlsConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNamespaceSlsConfigsResponse setBody(UpdateNamespaceSlsConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNamespaceSlsConfigsResponseBody getBody() {
        return this.body;
    }

}
