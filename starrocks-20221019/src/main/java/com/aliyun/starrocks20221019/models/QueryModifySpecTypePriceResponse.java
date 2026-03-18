// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryModifySpecTypePriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryModifySpecTypePriceResponseBody body;

    public static QueryModifySpecTypePriceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryModifySpecTypePriceResponse self = new QueryModifySpecTypePriceResponse();
        return TeaModel.build(map, self);
    }

    public QueryModifySpecTypePriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryModifySpecTypePriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryModifySpecTypePriceResponse setBody(QueryModifySpecTypePriceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryModifySpecTypePriceResponseBody getBody() {
        return this.body;
    }

}
