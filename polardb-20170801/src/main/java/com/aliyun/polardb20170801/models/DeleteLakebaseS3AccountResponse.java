// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteLakebaseS3AccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLakebaseS3AccountResponseBody body;

    public static DeleteLakebaseS3AccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLakebaseS3AccountResponse self = new DeleteLakebaseS3AccountResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLakebaseS3AccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLakebaseS3AccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLakebaseS3AccountResponse setBody(DeleteLakebaseS3AccountResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLakebaseS3AccountResponseBody getBody() {
        return this.body;
    }

}
