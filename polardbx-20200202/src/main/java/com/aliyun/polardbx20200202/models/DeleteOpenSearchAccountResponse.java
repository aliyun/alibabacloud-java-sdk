// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeleteOpenSearchAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOpenSearchAccountResponseBody body;

    public static DeleteOpenSearchAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOpenSearchAccountResponse self = new DeleteOpenSearchAccountResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOpenSearchAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOpenSearchAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOpenSearchAccountResponse setBody(DeleteOpenSearchAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOpenSearchAccountResponseBody getBody() {
        return this.body;
    }

}
