// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.partnerintl20181227.models;

import com.aliyun.tea.*;

public class QueryCommodityByServiceIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCommodityByServiceIdResponseBody body;

    public static QueryCommodityByServiceIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCommodityByServiceIdResponse self = new QueryCommodityByServiceIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryCommodityByServiceIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCommodityByServiceIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCommodityByServiceIdResponse setBody(QueryCommodityByServiceIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCommodityByServiceIdResponseBody getBody() {
        return this.body;
    }

}
