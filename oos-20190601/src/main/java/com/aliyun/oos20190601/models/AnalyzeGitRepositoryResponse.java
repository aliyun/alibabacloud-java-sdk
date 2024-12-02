// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class AnalyzeGitRepositoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AnalyzeGitRepositoryResponseBody body;

    public static AnalyzeGitRepositoryResponse build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeGitRepositoryResponse self = new AnalyzeGitRepositoryResponse();
        return TeaModel.build(map, self);
    }

    public AnalyzeGitRepositoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AnalyzeGitRepositoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AnalyzeGitRepositoryResponse setBody(AnalyzeGitRepositoryResponseBody body) {
        this.body = body;
        return this;
    }
    public AnalyzeGitRepositoryResponseBody getBody() {
        return this.body;
    }

}
