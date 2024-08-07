// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDataRangeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDataRangeResponseBody body;

    public static QueryDataRangeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDataRangeResponse self = new QueryDataRangeResponse();
        return TeaModel.build(map, self);
    }

    public QueryDataRangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDataRangeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDataRangeResponse setBody(QueryDataRangeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDataRangeResponseBody getBody() {
        return this.body;
    }

}
