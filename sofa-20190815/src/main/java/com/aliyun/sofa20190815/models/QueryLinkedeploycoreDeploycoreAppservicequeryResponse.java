// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreAppservicequeryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkedeploycoreDeploycoreAppservicequeryResponseBody body;

    public static QueryLinkedeploycoreDeploycoreAppservicequeryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreAppservicequeryResponse self = new QueryLinkedeploycoreDeploycoreAppservicequeryResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryResponse setBody(QueryLinkedeploycoreDeploycoreAppservicequeryResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreAppservicequeryResponseBody getBody() {
        return this.body;
    }

}
