// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class QueryProjectBuildDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryProjectBuildDetailResponseBody body;

    public static QueryProjectBuildDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectBuildDetailResponse self = new QueryProjectBuildDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryProjectBuildDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryProjectBuildDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryProjectBuildDetailResponse setBody(QueryProjectBuildDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryProjectBuildDetailResponseBody getBody() {
        return this.body;
    }

}
