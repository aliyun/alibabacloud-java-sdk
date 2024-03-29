// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class QueryMsgStatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMsgStatResponseBody body;

    public static QueryMsgStatResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsgStatResponse self = new QueryMsgStatResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsgStatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsgStatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMsgStatResponse setBody(QueryMsgStatResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsgStatResponseBody getBody() {
        return this.body;
    }

}
