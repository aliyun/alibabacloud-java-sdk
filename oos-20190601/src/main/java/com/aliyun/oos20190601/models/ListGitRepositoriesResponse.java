// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListGitRepositoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGitRepositoriesResponseBody body;

    public static ListGitRepositoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGitRepositoriesResponse self = new ListGitRepositoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListGitRepositoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGitRepositoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGitRepositoriesResponse setBody(ListGitRepositoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGitRepositoriesResponseBody getBody() {
        return this.body;
    }

}
