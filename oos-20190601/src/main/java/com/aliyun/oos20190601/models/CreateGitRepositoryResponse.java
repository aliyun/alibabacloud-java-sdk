// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateGitRepositoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGitRepositoryResponseBody body;

    public static CreateGitRepositoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGitRepositoryResponse self = new CreateGitRepositoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateGitRepositoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGitRepositoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGitRepositoryResponse setBody(CreateGitRepositoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGitRepositoryResponseBody getBody() {
        return this.body;
    }

}
