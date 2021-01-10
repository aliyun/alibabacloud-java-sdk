// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreTenantauthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkedeploycoreDeploycoreTenantauthResponseBody body;

    public static QueryLinkedeploycoreDeploycoreTenantauthResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreTenantauthResponse self = new QueryLinkedeploycoreDeploycoreTenantauthResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreTenantauthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkedeploycoreDeploycoreTenantauthResponse setBody(QueryLinkedeploycoreDeploycoreTenantauthResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreTenantauthResponseBody getBody() {
        return this.body;
    }

}
