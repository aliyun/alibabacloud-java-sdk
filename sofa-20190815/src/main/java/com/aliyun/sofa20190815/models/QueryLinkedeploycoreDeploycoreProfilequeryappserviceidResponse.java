// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseBody body;

    public static QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse self = new QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponse setBody(QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreProfilequeryappserviceidResponseBody getBody() {
        return this.body;
    }

}
