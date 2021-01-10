// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreAppserviceiterationbindResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkedeploycoreDeploycoreAppserviceiterationbindResponseBody body;

    public static QueryLinkedeploycoreDeploycoreAppserviceiterationbindResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreAppserviceiterationbindResponse self = new QueryLinkedeploycoreDeploycoreAppserviceiterationbindResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreAppserviceiterationbindResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkedeploycoreDeploycoreAppserviceiterationbindResponse setBody(QueryLinkedeploycoreDeploycoreAppserviceiterationbindResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreAppserviceiterationbindResponseBody getBody() {
        return this.body;
    }

}
