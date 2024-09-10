// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryGuidTaskListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryGuidTaskListResponseBody body;

    public static QueryGuidTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGuidTaskListResponse self = new QueryGuidTaskListResponse();
        return TeaModel.build(map, self);
    }

    public QueryGuidTaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryGuidTaskListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryGuidTaskListResponse setBody(QueryGuidTaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryGuidTaskListResponseBody getBody() {
        return this.body;
    }

}
