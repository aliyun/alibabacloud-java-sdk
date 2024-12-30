// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryLlmCubeWithThemeListByUserIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryLlmCubeWithThemeListByUserIdResponseBody body;

    public static QueryLlmCubeWithThemeListByUserIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLlmCubeWithThemeListByUserIdResponse self = new QueryLlmCubeWithThemeListByUserIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryLlmCubeWithThemeListByUserIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLlmCubeWithThemeListByUserIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryLlmCubeWithThemeListByUserIdResponse setBody(QueryLlmCubeWithThemeListByUserIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLlmCubeWithThemeListByUserIdResponseBody getBody() {
        return this.body;
    }

}
