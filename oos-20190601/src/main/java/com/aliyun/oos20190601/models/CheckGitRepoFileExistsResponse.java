// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CheckGitRepoFileExistsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckGitRepoFileExistsResponseBody body;

    public static CheckGitRepoFileExistsResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckGitRepoFileExistsResponse self = new CheckGitRepoFileExistsResponse();
        return TeaModel.build(map, self);
    }

    public CheckGitRepoFileExistsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckGitRepoFileExistsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckGitRepoFileExistsResponse setBody(CheckGitRepoFileExistsResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckGitRepoFileExistsResponseBody getBody() {
        return this.body;
    }

}
