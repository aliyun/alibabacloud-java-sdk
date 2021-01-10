// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreResourcequeryappserviceidpodResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkedeploycoreDeploycoreResourcequeryappserviceidpodResponseBody body;

    public static QueryLinkedeploycoreDeploycoreResourcequeryappserviceidpodResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreResourcequeryappserviceidpodResponse self = new QueryLinkedeploycoreDeploycoreResourcequeryappserviceidpodResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreResourcequeryappserviceidpodResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkedeploycoreDeploycoreResourcequeryappserviceidpodResponse setBody(QueryLinkedeploycoreDeploycoreResourcequeryappserviceidpodResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreResourcequeryappserviceidpodResponseBody getBody() {
        return this.body;
    }

}
