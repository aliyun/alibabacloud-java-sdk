// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class QueryWorkItemFeedResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryWorkItemFeedResponseBody body;

    public static QueryWorkItemFeedResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWorkItemFeedResponse self = new QueryWorkItemFeedResponse();
        return TeaModel.build(map, self);
    }

    public QueryWorkItemFeedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryWorkItemFeedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryWorkItemFeedResponse setBody(QueryWorkItemFeedResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryWorkItemFeedResponseBody getBody() {
        return this.body;
    }

}
