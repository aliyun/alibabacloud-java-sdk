// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreTenantallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkedeploycoreDeploycoreTenantallResponseBody body;

    public static QueryLinkedeploycoreDeploycoreTenantallResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreTenantallResponse self = new QueryLinkedeploycoreDeploycoreTenantallResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreTenantallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkedeploycoreDeploycoreTenantallResponse setBody(QueryLinkedeploycoreDeploycoreTenantallResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreTenantallResponseBody getBody() {
        return this.body;
    }

}
