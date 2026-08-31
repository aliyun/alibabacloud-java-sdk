// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class QueryColumnarLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryColumnarLogResponseBody body;

    public static QueryColumnarLogResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryColumnarLogResponse self = new QueryColumnarLogResponse();
        return TeaModel.build(map, self);
    }

    public QueryColumnarLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryColumnarLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryColumnarLogResponse setBody(QueryColumnarLogResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryColumnarLogResponseBody getBody() {
        return this.body;
    }

}
