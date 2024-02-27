// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_verify_agent20240131.models;

import com.aliyun.tea.*;

public class QueryAppInfoBySchemeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAppInfoBySchemeResponseBody body;

    public static QueryAppInfoBySchemeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppInfoBySchemeResponse self = new QueryAppInfoBySchemeResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppInfoBySchemeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAppInfoBySchemeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAppInfoBySchemeResponse setBody(QueryAppInfoBySchemeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAppInfoBySchemeResponseBody getBody() {
        return this.body;
    }

}
