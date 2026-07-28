// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteResourceControlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteResourceControlResponseBody body;

    public static DeleteResourceControlResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceControlResponse self = new DeleteResourceControlResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResourceControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteResourceControlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteResourceControlResponse setBody(DeleteResourceControlResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteResourceControlResponseBody getBody() {
        return this.body;
    }

}
