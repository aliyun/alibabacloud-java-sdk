// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryModifyDiskSizePriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryModifyDiskSizePriceResponseBody body;

    public static QueryModifyDiskSizePriceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryModifyDiskSizePriceResponse self = new QueryModifyDiskSizePriceResponse();
        return TeaModel.build(map, self);
    }

    public QueryModifyDiskSizePriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryModifyDiskSizePriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryModifyDiskSizePriceResponse setBody(QueryModifyDiskSizePriceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryModifyDiskSizePriceResponseBody getBody() {
        return this.body;
    }

}
