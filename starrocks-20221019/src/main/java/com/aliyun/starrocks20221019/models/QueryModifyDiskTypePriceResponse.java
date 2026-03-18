// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryModifyDiskTypePriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryModifyDiskTypePriceResponseBody body;

    public static QueryModifyDiskTypePriceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryModifyDiskTypePriceResponse self = new QueryModifyDiskTypePriceResponse();
        return TeaModel.build(map, self);
    }

    public QueryModifyDiskTypePriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryModifyDiskTypePriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryModifyDiskTypePriceResponse setBody(QueryModifyDiskTypePriceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryModifyDiskTypePriceResponseBody getBody() {
        return this.body;
    }

}
