// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorksByOrganizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryWorksByOrganizationResponseBody body;

    public static QueryWorksByOrganizationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWorksByOrganizationResponse self = new QueryWorksByOrganizationResponse();
        return TeaModel.build(map, self);
    }

    public QueryWorksByOrganizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryWorksByOrganizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryWorksByOrganizationResponse setBody(QueryWorksByOrganizationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryWorksByOrganizationResponseBody getBody() {
        return this.body;
    }

}
