// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class QuerySampleConsistencyJobDifferenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySampleConsistencyJobDifferenceResponseBody body;

    public static QuerySampleConsistencyJobDifferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySampleConsistencyJobDifferenceResponse self = new QuerySampleConsistencyJobDifferenceResponse();
        return TeaModel.build(map, self);
    }

    public QuerySampleConsistencyJobDifferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySampleConsistencyJobDifferenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySampleConsistencyJobDifferenceResponse setBody(QuerySampleConsistencyJobDifferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySampleConsistencyJobDifferenceResponseBody getBody() {
        return this.body;
    }

}
