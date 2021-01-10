// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreEnvqueryproducthostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkedeploycoreDeploycoreEnvqueryproducthostResponseBody body;

    public static QueryLinkedeploycoreDeploycoreEnvqueryproducthostResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreEnvqueryproducthostResponse self = new QueryLinkedeploycoreDeploycoreEnvqueryproducthostResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreEnvqueryproducthostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkedeploycoreDeploycoreEnvqueryproducthostResponse setBody(QueryLinkedeploycoreDeploycoreEnvqueryproducthostResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreEnvqueryproducthostResponseBody getBody() {
        return this.body;
    }

}
