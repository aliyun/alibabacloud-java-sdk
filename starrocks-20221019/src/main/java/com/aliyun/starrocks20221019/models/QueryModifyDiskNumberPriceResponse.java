// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryModifyDiskNumberPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryModifyDiskNumberPriceResponseBody body;

    public static QueryModifyDiskNumberPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryModifyDiskNumberPriceResponse self = new QueryModifyDiskNumberPriceResponse();
        return TeaModel.build(map, self);
    }

    public QueryModifyDiskNumberPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryModifyDiskNumberPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryModifyDiskNumberPriceResponse setBody(QueryModifyDiskNumberPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryModifyDiskNumberPriceResponseBody getBody() {
        return this.body;
    }

}
