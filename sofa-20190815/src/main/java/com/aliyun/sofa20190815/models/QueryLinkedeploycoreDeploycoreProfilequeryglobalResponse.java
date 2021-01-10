// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreProfilequeryglobalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkedeploycoreDeploycoreProfilequeryglobalResponseBody body;

    public static QueryLinkedeploycoreDeploycoreProfilequeryglobalResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreProfilequeryglobalResponse self = new QueryLinkedeploycoreDeploycoreProfilequeryglobalResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreProfilequeryglobalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkedeploycoreDeploycoreProfilequeryglobalResponse setBody(QueryLinkedeploycoreDeploycoreProfilequeryglobalResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreProfilequeryglobalResponseBody getBody() {
        return this.body;
    }

}
