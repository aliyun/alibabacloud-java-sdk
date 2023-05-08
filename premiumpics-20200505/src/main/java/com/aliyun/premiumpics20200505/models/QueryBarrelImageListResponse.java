// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class QueryBarrelImageListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryBarrelImageListResponseBody body;

    public static QueryBarrelImageListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBarrelImageListResponse self = new QueryBarrelImageListResponse();
        return TeaModel.build(map, self);
    }

    public QueryBarrelImageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBarrelImageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBarrelImageListResponse setBody(QueryBarrelImageListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBarrelImageListResponseBody getBody() {
        return this.body;
    }

}
