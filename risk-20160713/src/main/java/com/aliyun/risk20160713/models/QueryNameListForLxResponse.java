// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class QueryNameListForLxResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryNameListForLxResponseBody body;

    public static QueryNameListForLxResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryNameListForLxResponse self = new QueryNameListForLxResponse();
        return TeaModel.build(map, self);
    }

    public QueryNameListForLxResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryNameListForLxResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryNameListForLxResponse setBody(QueryNameListForLxResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryNameListForLxResponseBody getBody() {
        return this.body;
    }

}
