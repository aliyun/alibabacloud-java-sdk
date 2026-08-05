// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateLakebaseS3AccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLakebaseS3AccountResponseBody body;

    public static CreateLakebaseS3AccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLakebaseS3AccountResponse self = new CreateLakebaseS3AccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateLakebaseS3AccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLakebaseS3AccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLakebaseS3AccountResponse setBody(CreateLakebaseS3AccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLakebaseS3AccountResponseBody getBody() {
        return this.body;
    }

}
