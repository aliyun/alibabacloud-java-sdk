// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListGitRepositoryContentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGitRepositoryContentsResponseBody body;

    public static ListGitRepositoryContentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGitRepositoryContentsResponse self = new ListGitRepositoryContentsResponse();
        return TeaModel.build(map, self);
    }

    public ListGitRepositoryContentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGitRepositoryContentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGitRepositoryContentsResponse setBody(ListGitRepositoryContentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGitRepositoryContentsResponseBody getBody() {
        return this.body;
    }

}
