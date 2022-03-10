// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorksByOrganizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryWorksByOrganizationResponse setBody(QueryWorksByOrganizationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryWorksByOrganizationResponseBody getBody() {
        return this.body;
    }

}
