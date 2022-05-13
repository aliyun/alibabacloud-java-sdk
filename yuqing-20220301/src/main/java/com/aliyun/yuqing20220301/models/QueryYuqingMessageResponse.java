// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class QueryYuqingMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryYuqingMessageResponseBody body;

    public static QueryYuqingMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryYuqingMessageResponse self = new QueryYuqingMessageResponse();
        return TeaModel.build(map, self);
    }

    public QueryYuqingMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryYuqingMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryYuqingMessageResponse setBody(QueryYuqingMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryYuqingMessageResponseBody getBody() {
        return this.body;
    }

}
