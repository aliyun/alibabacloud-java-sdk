// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class QueryConversationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryConversationsResponseBody body;

    public static QueryConversationsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConversationsResponse self = new QueryConversationsResponse();
        return TeaModel.build(map, self);
    }

    public QueryConversationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryConversationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryConversationsResponse setBody(QueryConversationsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryConversationsResponseBody getBody() {
        return this.body;
    }

}
