// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class QueryMemberBasicInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMemberBasicInfoResponseBody body;

    public static QueryMemberBasicInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMemberBasicInfoResponse self = new QueryMemberBasicInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryMemberBasicInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMemberBasicInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMemberBasicInfoResponse setBody(QueryMemberBasicInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMemberBasicInfoResponseBody getBody() {
        return this.body;
    }

}
