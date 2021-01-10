// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreEnvquerydeploymodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkedeploycoreDeploycoreEnvquerydeploymodeResponseBody body;

    public static QueryLinkedeploycoreDeploycoreEnvquerydeploymodeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreEnvquerydeploymodeResponse self = new QueryLinkedeploycoreDeploycoreEnvquerydeploymodeResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreEnvquerydeploymodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkedeploycoreDeploycoreEnvquerydeploymodeResponse setBody(QueryLinkedeploycoreDeploycoreEnvquerydeploymodeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreEnvquerydeploymodeResponseBody getBody() {
        return this.body;
    }

}
