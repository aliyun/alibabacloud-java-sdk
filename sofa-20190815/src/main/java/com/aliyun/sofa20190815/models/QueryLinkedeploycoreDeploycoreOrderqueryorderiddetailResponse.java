// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBody body;

    public static QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse self = new QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse setBody(QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseBody getBody() {
        return this.body;
    }

}
