// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreAppservicequerycomputersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkedeploycoreDeploycoreAppservicequerycomputersResponseBody body;

    public static QueryLinkedeploycoreDeploycoreAppservicequerycomputersResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreAppservicequerycomputersResponse self = new QueryLinkedeploycoreDeploycoreAppservicequerycomputersResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreAppservicequerycomputersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequerycomputersResponse setBody(QueryLinkedeploycoreDeploycoreAppservicequerycomputersResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreAppservicequerycomputersResponseBody getBody() {
        return this.body;
    }

}
