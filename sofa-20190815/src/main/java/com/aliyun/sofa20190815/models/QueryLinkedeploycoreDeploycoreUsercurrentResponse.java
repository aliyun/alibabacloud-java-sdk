// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreUsercurrentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkedeploycoreDeploycoreUsercurrentResponseBody body;

    public static QueryLinkedeploycoreDeploycoreUsercurrentResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreUsercurrentResponse self = new QueryLinkedeploycoreDeploycoreUsercurrentResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreUsercurrentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkedeploycoreDeploycoreUsercurrentResponse setBody(QueryLinkedeploycoreDeploycoreUsercurrentResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreUsercurrentResponseBody getBody() {
        return this.body;
    }

}
