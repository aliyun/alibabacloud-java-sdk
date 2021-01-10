// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponseBody body;

    public static QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponse self = new QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponse setBody(QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponseBody getBody() {
        return this.body;
    }

}
