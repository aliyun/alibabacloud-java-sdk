// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteExtensionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteExtensionsResponseBody body;

    public static DeleteExtensionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExtensionsResponse self = new DeleteExtensionsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExtensionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExtensionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteExtensionsResponse setBody(DeleteExtensionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExtensionsResponseBody getBody() {
        return this.body;
    }

}
