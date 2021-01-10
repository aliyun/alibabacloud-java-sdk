// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreAppservicefollowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkedeploycoreDeploycoreAppservicefollowResponseBody body;

    public static QueryLinkedeploycoreDeploycoreAppservicefollowResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreAppservicefollowResponse self = new QueryLinkedeploycoreDeploycoreAppservicefollowResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreAppservicefollowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkedeploycoreDeploycoreAppservicefollowResponse setBody(QueryLinkedeploycoreDeploycoreAppservicefollowResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreAppservicefollowResponseBody getBody() {
        return this.body;
    }

}
