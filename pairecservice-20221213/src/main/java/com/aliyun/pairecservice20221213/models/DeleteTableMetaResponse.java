// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteTableMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTableMetaResponseBody body;

    public static DeleteTableMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTableMetaResponse self = new DeleteTableMetaResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTableMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTableMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTableMetaResponse setBody(DeleteTableMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTableMetaResponseBody getBody() {
        return this.body;
    }

}
