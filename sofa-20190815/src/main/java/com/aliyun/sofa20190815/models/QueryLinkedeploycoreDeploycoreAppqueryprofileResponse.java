// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreAppqueryprofileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBody body;

    public static QueryLinkedeploycoreDeploycoreAppqueryprofileResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreAppqueryprofileResponse self = new QueryLinkedeploycoreDeploycoreAppqueryprofileResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreAppqueryprofileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkedeploycoreDeploycoreAppqueryprofileResponse setBody(QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreAppqueryprofileResponseBody getBody() {
        return this.body;
    }

}
