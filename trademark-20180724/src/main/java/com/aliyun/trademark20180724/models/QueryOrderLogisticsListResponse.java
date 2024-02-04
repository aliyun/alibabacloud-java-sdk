// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryOrderLogisticsListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryOrderLogisticsListResponseBody body;

    public static QueryOrderLogisticsListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderLogisticsListResponse self = new QueryOrderLogisticsListResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderLogisticsListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOrderLogisticsListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOrderLogisticsListResponse setBody(QueryOrderLogisticsListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOrderLogisticsListResponseBody getBody() {
        return this.body;
    }

}
