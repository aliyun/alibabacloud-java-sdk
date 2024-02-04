// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTmSbjProduceDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTmSbjProduceDetailResponseBody body;

    public static QueryTmSbjProduceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTmSbjProduceDetailResponse self = new QueryTmSbjProduceDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryTmSbjProduceDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTmSbjProduceDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTmSbjProduceDetailResponse setBody(QueryTmSbjProduceDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTmSbjProduceDetailResponseBody getBody() {
        return this.body;
    }

}
