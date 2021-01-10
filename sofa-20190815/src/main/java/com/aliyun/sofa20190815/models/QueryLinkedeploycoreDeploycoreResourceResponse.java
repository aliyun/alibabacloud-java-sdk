// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkedeploycoreDeploycoreResourceResponseBody body;

    public static QueryLinkedeploycoreDeploycoreResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreResourceResponse self = new QueryLinkedeploycoreDeploycoreResourceResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkedeploycoreDeploycoreResourceResponse setBody(QueryLinkedeploycoreDeploycoreResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreResourceResponseBody getBody() {
        return this.body;
    }

}
