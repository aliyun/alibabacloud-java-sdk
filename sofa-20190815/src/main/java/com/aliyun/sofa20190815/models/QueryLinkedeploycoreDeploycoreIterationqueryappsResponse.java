// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreIterationqueryappsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkedeploycoreDeploycoreIterationqueryappsResponseBody body;

    public static QueryLinkedeploycoreDeploycoreIterationqueryappsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreIterationqueryappsResponse self = new QueryLinkedeploycoreDeploycoreIterationqueryappsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreIterationqueryappsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkedeploycoreDeploycoreIterationqueryappsResponse setBody(QueryLinkedeploycoreDeploycoreIterationqueryappsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreIterationqueryappsResponseBody getBody() {
        return this.body;
    }

}
