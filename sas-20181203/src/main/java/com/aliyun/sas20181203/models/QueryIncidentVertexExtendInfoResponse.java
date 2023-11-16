// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentVertexExtendInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryIncidentVertexExtendInfoResponseBody body;

    public static QueryIncidentVertexExtendInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIncidentVertexExtendInfoResponse self = new QueryIncidentVertexExtendInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryIncidentVertexExtendInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryIncidentVertexExtendInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryIncidentVertexExtendInfoResponse setBody(QueryIncidentVertexExtendInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryIncidentVertexExtendInfoResponseBody getBody() {
        return this.body;
    }

}
