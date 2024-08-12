// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListUserFbAcIssuesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserFbAcIssuesResponseBody body;

    public static ListUserFbAcIssuesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserFbAcIssuesResponse self = new ListUserFbAcIssuesResponse();
        return TeaModel.build(map, self);
    }

    public ListUserFbAcIssuesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserFbAcIssuesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserFbAcIssuesResponse setBody(ListUserFbAcIssuesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserFbAcIssuesResponseBody getBody() {
        return this.body;
    }

}
