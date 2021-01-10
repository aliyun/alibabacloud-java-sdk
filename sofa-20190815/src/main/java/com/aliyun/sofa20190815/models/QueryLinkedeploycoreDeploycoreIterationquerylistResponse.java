// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreIterationquerylistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkedeploycoreDeploycoreIterationquerylistResponseBody body;

    public static QueryLinkedeploycoreDeploycoreIterationquerylistResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreIterationquerylistResponse self = new QueryLinkedeploycoreDeploycoreIterationquerylistResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreIterationquerylistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkedeploycoreDeploycoreIterationquerylistResponse setBody(QueryLinkedeploycoreDeploycoreIterationquerylistResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreIterationquerylistResponseBody getBody() {
        return this.body;
    }

}
