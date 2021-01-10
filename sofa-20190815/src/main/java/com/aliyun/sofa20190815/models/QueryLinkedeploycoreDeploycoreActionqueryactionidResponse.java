// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreActionqueryactionidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBody body;

    public static QueryLinkedeploycoreDeploycoreActionqueryactionidResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreActionqueryactionidResponse self = new QueryLinkedeploycoreDeploycoreActionqueryactionidResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreActionqueryactionidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkedeploycoreDeploycoreActionqueryactionidResponse setBody(QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreActionqueryactionidResponseBody getBody() {
        return this.body;
    }

}
