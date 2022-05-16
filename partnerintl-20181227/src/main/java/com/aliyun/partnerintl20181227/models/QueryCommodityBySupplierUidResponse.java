// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.partnerintl20181227.models;

import com.aliyun.tea.*;

public class QueryCommodityBySupplierUidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCommodityBySupplierUidResponseBody body;

    public static QueryCommodityBySupplierUidResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCommodityBySupplierUidResponse self = new QueryCommodityBySupplierUidResponse();
        return TeaModel.build(map, self);
    }

    public QueryCommodityBySupplierUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCommodityBySupplierUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCommodityBySupplierUidResponse setBody(QueryCommodityBySupplierUidResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCommodityBySupplierUidResponseBody getBody() {
        return this.body;
    }

}
