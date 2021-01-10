// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinkaStatisticsResponseBody body;

    public static QueryLinkeLinkaStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaStatisticsResponse self = new QueryLinkeLinkaStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinkaStatisticsResponse setBody(QueryLinkeLinkaStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinkaStatisticsResponseBody getBody() {
        return this.body;
    }

}
