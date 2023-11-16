// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentIconListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryIncidentIconListResponseBody body;

    public static QueryIncidentIconListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIncidentIconListResponse self = new QueryIncidentIconListResponse();
        return TeaModel.build(map, self);
    }

    public QueryIncidentIconListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryIncidentIconListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryIncidentIconListResponse setBody(QueryIncidentIconListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryIncidentIconListResponseBody getBody() {
        return this.body;
    }

}
