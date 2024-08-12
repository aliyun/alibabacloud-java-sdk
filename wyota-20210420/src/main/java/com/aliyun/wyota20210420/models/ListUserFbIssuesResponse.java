// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListUserFbIssuesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserFbIssuesResponseBody body;

    public static ListUserFbIssuesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserFbIssuesResponse self = new ListUserFbIssuesResponse();
        return TeaModel.build(map, self);
    }

    public ListUserFbIssuesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserFbIssuesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserFbIssuesResponse setBody(ListUserFbIssuesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserFbIssuesResponseBody getBody() {
        return this.body;
    }

}
