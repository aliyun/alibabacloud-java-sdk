// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class DeleteResourceShareResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteResourceShareResponseBody body;

    public static DeleteResourceShareResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceShareResponse self = new DeleteResourceShareResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResourceShareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteResourceShareResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteResourceShareResponse setBody(DeleteResourceShareResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteResourceShareResponseBody getBody() {
        return this.body;
    }

}
