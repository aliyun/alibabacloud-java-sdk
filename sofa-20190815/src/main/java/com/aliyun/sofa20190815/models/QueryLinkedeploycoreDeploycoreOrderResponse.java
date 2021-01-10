// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkedeploycoreDeploycoreOrderResponseBody body;

    public static QueryLinkedeploycoreDeploycoreOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreOrderResponse self = new QueryLinkedeploycoreDeploycoreOrderResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkedeploycoreDeploycoreOrderResponse setBody(QueryLinkedeploycoreDeploycoreOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreOrderResponseBody getBody() {
        return this.body;
    }

}
