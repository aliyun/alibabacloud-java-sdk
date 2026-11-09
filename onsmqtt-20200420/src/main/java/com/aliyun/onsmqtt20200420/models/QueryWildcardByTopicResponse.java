// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QueryWildcardByTopicResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryWildcardByTopicResponseBody body;

    public static QueryWildcardByTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWildcardByTopicResponse self = new QueryWildcardByTopicResponse();
        return TeaModel.build(map, self);
    }

    public QueryWildcardByTopicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryWildcardByTopicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryWildcardByTopicResponse setBody(QueryWildcardByTopicResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryWildcardByTopicResponseBody getBody() {
        return this.body;
    }

}
