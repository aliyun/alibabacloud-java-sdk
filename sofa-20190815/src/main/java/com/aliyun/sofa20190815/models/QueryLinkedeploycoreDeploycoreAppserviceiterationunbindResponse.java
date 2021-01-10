// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreAppserviceiterationunbindResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkedeploycoreDeploycoreAppserviceiterationunbindResponseBody body;

    public static QueryLinkedeploycoreDeploycoreAppserviceiterationunbindResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreAppserviceiterationunbindResponse self = new QueryLinkedeploycoreDeploycoreAppserviceiterationunbindResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreAppserviceiterationunbindResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkedeploycoreDeploycoreAppserviceiterationunbindResponse setBody(QueryLinkedeploycoreDeploycoreAppserviceiterationunbindResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreAppserviceiterationunbindResponseBody getBody() {
        return this.body;
    }

}
