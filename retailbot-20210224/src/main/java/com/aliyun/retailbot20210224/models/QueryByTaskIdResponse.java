// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QueryByTaskIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryByTaskIdResponseBody body;

    public static QueryByTaskIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryByTaskIdResponse self = new QueryByTaskIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryByTaskIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryByTaskIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryByTaskIdResponse setBody(QueryByTaskIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryByTaskIdResponseBody getBody() {
        return this.body;
    }

}
