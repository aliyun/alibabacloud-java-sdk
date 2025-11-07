// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CheckGitRepositoryExistsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckGitRepositoryExistsResponseBody body;

    public static CheckGitRepositoryExistsResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckGitRepositoryExistsResponse self = new CheckGitRepositoryExistsResponse();
        return TeaModel.build(map, self);
    }

    public CheckGitRepositoryExistsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckGitRepositoryExistsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckGitRepositoryExistsResponse setBody(CheckGitRepositoryExistsResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckGitRepositoryExistsResponseBody getBody() {
        return this.body;
    }

}
