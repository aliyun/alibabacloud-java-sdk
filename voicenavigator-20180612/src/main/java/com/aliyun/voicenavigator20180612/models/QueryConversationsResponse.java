// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class QueryConversationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryConversationsResponse setBody(QueryConversationsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryConversationsResponseBody getBody() {
        return this.body;
    }

}
