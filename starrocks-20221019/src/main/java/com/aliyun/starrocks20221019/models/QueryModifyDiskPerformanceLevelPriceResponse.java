// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryModifyDiskPerformanceLevelPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryModifyDiskPerformanceLevelPriceResponseBody body;

    public static QueryModifyDiskPerformanceLevelPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryModifyDiskPerformanceLevelPriceResponse self = new QueryModifyDiskPerformanceLevelPriceResponse();
        return TeaModel.build(map, self);
    }

    public QueryModifyDiskPerformanceLevelPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryModifyDiskPerformanceLevelPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryModifyDiskPerformanceLevelPriceResponse setBody(QueryModifyDiskPerformanceLevelPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryModifyDiskPerformanceLevelPriceResponseBody getBody() {
        return this.body;
    }

}
