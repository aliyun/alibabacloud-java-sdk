// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryMediaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMediaResponseBody body;

    public static QueryMediaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaResponse self = new QueryMediaResponse();
        return TeaModel.build(map, self);
    }

    public QueryMediaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMediaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMediaResponse setBody(QueryMediaResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMediaResponseBody getBody() {
        return this.body;
    }

}
