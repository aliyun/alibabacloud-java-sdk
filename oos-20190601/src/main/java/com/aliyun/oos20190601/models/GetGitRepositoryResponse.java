// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetGitRepositoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGitRepositoryResponseBody body;

    public static GetGitRepositoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGitRepositoryResponse self = new GetGitRepositoryResponse();
        return TeaModel.build(map, self);
    }

    public GetGitRepositoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGitRepositoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGitRepositoryResponse setBody(GetGitRepositoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGitRepositoryResponseBody getBody() {
        return this.body;
    }

}
