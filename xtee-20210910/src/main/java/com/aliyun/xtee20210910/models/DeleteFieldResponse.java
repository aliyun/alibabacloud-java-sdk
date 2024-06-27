// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeleteFieldResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFieldResponseBody body;

    public static DeleteFieldResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFieldResponse self = new DeleteFieldResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFieldResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFieldResponse setBody(DeleteFieldResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFieldResponseBody getBody() {
        return this.body;
    }

}
