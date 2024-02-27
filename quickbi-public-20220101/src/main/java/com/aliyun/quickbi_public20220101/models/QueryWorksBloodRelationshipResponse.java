// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorksBloodRelationshipResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryWorksBloodRelationshipResponseBody body;

    public static QueryWorksBloodRelationshipResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWorksBloodRelationshipResponse self = new QueryWorksBloodRelationshipResponse();
        return TeaModel.build(map, self);
    }

    public QueryWorksBloodRelationshipResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryWorksBloodRelationshipResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryWorksBloodRelationshipResponse setBody(QueryWorksBloodRelationshipResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryWorksBloodRelationshipResponseBody getBody() {
        return this.body;
    }

}
