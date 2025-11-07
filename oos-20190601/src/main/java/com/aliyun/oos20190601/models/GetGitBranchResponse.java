// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetGitBranchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGitBranchResponseBody body;

    public static GetGitBranchResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGitBranchResponse self = new GetGitBranchResponse();
        return TeaModel.build(map, self);
    }

    public GetGitBranchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGitBranchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGitBranchResponse setBody(GetGitBranchResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGitBranchResponseBody getBody() {
        return this.body;
    }

}
