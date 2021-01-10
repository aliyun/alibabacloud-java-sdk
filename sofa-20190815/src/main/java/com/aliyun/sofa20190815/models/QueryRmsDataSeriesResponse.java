// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsDataSeriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsDataSeriesResponseBody body;

    public static QueryRmsDataSeriesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsDataSeriesResponse self = new QueryRmsDataSeriesResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsDataSeriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsDataSeriesResponse setBody(QueryRmsDataSeriesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsDataSeriesResponseBody getBody() {
        return this.body;
    }

}
