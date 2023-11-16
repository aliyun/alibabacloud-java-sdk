// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentSubNodesCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryIncidentSubNodesCountResponseBody body;

    public static QueryIncidentSubNodesCountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIncidentSubNodesCountResponse self = new QueryIncidentSubNodesCountResponse();
        return TeaModel.build(map, self);
    }

    public QueryIncidentSubNodesCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryIncidentSubNodesCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryIncidentSubNodesCountResponse setBody(QueryIncidentSubNodesCountResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryIncidentSubNodesCountResponseBody getBody() {
        return this.body;
    }

}
