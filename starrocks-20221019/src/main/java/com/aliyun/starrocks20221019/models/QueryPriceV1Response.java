// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryPriceV1Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPriceV1ResponseBody body;

    public static QueryPriceV1Response build(java.util.Map<String, ?> map) throws Exception {
        QueryPriceV1Response self = new QueryPriceV1Response();
        return TeaModel.build(map, self);
    }

    public QueryPriceV1Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPriceV1Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPriceV1Response setBody(QueryPriceV1ResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPriceV1ResponseBody getBody() {
        return this.body;
    }

}
