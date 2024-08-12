// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListFbIssueLabelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFbIssueLabelsResponseBody body;

    public static ListFbIssueLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFbIssueLabelsResponse self = new ListFbIssueLabelsResponse();
        return TeaModel.build(map, self);
    }

    public ListFbIssueLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFbIssueLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFbIssueLabelsResponse setBody(ListFbIssueLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFbIssueLabelsResponseBody getBody() {
        return this.body;
    }

}
