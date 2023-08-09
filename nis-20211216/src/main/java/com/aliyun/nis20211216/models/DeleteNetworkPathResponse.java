// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DeleteNetworkPathResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteNetworkPathResponseBody body;

    public static DeleteNetworkPathResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkPathResponse self = new DeleteNetworkPathResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkPathResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNetworkPathResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNetworkPathResponse setBody(DeleteNetworkPathResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNetworkPathResponseBody getBody() {
        return this.body;
    }

}
