// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryOrganizationRoleConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryOrganizationRoleConfigResponseBody body;

    public static QueryOrganizationRoleConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrganizationRoleConfigResponse self = new QueryOrganizationRoleConfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrganizationRoleConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOrganizationRoleConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOrganizationRoleConfigResponse setBody(QueryOrganizationRoleConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOrganizationRoleConfigResponseBody getBody() {
        return this.body;
    }

}
