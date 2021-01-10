// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycorePipelinesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkedeploycoreDeploycorePipelinesResponseBody body;

    public static QueryLinkedeploycoreDeploycorePipelinesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycorePipelinesResponse self = new QueryLinkedeploycoreDeploycorePipelinesResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycorePipelinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkedeploycoreDeploycorePipelinesResponse setBody(QueryLinkedeploycoreDeploycorePipelinesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkedeploycoreDeploycorePipelinesResponseBody getBody() {
        return this.body;
    }

}
