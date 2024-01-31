// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentVertexNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryIncidentVertexNodesResponseBody body;

    public static QueryIncidentVertexNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIncidentVertexNodesResponse self = new QueryIncidentVertexNodesResponse();
        return TeaModel.build(map, self);
    }

    public QueryIncidentVertexNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryIncidentVertexNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryIncidentVertexNodesResponse setBody(QueryIncidentVertexNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryIncidentVertexNodesResponseBody getBody() {
        return this.body;
    }

}
