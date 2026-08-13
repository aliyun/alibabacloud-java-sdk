// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePersonalDirectoryResponseBody body;

    public static CreatePersonalDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalDirectoryResponse self = new CreatePersonalDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public CreatePersonalDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePersonalDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePersonalDirectoryResponse setBody(CreatePersonalDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePersonalDirectoryResponseBody getBody() {
        return this.body;
    }

}
