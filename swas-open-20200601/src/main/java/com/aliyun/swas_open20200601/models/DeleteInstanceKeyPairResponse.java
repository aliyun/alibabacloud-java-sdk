// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DeleteInstanceKeyPairResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteInstanceKeyPairResponseBody body;

    public static DeleteInstanceKeyPairResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceKeyPairResponse self = new DeleteInstanceKeyPairResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceKeyPairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInstanceKeyPairResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteInstanceKeyPairResponse setBody(DeleteInstanceKeyPairResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInstanceKeyPairResponseBody getBody() {
        return this.body;
    }

}
