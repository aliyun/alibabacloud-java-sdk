// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryServicerByDepartmentAndMixNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryServicerByDepartmentAndMixNameResponseBody body;

    public static QueryServicerByDepartmentAndMixNameResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryServicerByDepartmentAndMixNameResponse self = new QueryServicerByDepartmentAndMixNameResponse();
        return TeaModel.build(map, self);
    }

    public QueryServicerByDepartmentAndMixNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryServicerByDepartmentAndMixNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryServicerByDepartmentAndMixNameResponse setBody(QueryServicerByDepartmentAndMixNameResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryServicerByDepartmentAndMixNameResponseBody getBody() {
        return this.body;
    }

}
