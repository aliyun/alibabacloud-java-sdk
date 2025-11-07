// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListGitBranchesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGitBranchesResponseBody body;

    public static ListGitBranchesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGitBranchesResponse self = new ListGitBranchesResponse();
        return TeaModel.build(map, self);
    }

    public ListGitBranchesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGitBranchesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGitBranchesResponse setBody(ListGitBranchesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGitBranchesResponseBody getBody() {
        return this.body;
    }

}
