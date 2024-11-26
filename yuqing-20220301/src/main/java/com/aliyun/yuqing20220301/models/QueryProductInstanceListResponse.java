// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class QueryProductInstanceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryProductInstanceListResponseBody body;

    public static QueryProductInstanceListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProductInstanceListResponse self = new QueryProductInstanceListResponse();
        return TeaModel.build(map, self);
    }

    public QueryProductInstanceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryProductInstanceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryProductInstanceListResponse setBody(QueryProductInstanceListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryProductInstanceListResponseBody getBody() {
        return this.body;
    }

}
