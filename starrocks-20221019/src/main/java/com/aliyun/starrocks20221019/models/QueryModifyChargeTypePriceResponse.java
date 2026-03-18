// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryModifyChargeTypePriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryModifyChargeTypePriceResponseBody body;

    public static QueryModifyChargeTypePriceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryModifyChargeTypePriceResponse self = new QueryModifyChargeTypePriceResponse();
        return TeaModel.build(map, self);
    }

    public QueryModifyChargeTypePriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryModifyChargeTypePriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryModifyChargeTypePriceResponse setBody(QueryModifyChargeTypePriceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryModifyChargeTypePriceResponseBody getBody() {
        return this.body;
    }

}
