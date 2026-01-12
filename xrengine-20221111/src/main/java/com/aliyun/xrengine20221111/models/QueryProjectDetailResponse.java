// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class QueryProjectDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryProjectDetailResponseBody body;

    public static QueryProjectDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectDetailResponse self = new QueryProjectDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryProjectDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryProjectDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryProjectDetailResponse setBody(QueryProjectDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryProjectDetailResponseBody getBody() {
        return this.body;
    }

}
