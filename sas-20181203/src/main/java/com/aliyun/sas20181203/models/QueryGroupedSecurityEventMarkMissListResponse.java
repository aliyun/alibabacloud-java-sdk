// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryGroupedSecurityEventMarkMissListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryGroupedSecurityEventMarkMissListResponseBody body;

    public static QueryGroupedSecurityEventMarkMissListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGroupedSecurityEventMarkMissListResponse self = new QueryGroupedSecurityEventMarkMissListResponse();
        return TeaModel.build(map, self);
    }

    public QueryGroupedSecurityEventMarkMissListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryGroupedSecurityEventMarkMissListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryGroupedSecurityEventMarkMissListResponse setBody(QueryGroupedSecurityEventMarkMissListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryGroupedSecurityEventMarkMissListResponseBody getBody() {
        return this.body;
    }

}
