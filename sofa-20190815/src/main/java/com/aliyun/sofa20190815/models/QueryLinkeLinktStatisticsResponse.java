// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinktStatisticsResponseBody body;

    public static QueryLinkeLinktStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktStatisticsResponse self = new QueryLinkeLinktStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinktStatisticsResponse setBody(QueryLinkeLinktStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinktStatisticsResponseBody getBody() {
        return this.body;
    }

}
