// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class QueryColumnarLogSSEResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryColumnarLogSSEResponseBody body;

    public static QueryColumnarLogSSEResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryColumnarLogSSEResponse self = new QueryColumnarLogSSEResponse();
        return TeaModel.build(map, self);
    }

    public QueryColumnarLogSSEResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryColumnarLogSSEResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryColumnarLogSSEResponse setBody(QueryColumnarLogSSEResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryColumnarLogSSEResponseBody getBody() {
        return this.body;
    }

}
