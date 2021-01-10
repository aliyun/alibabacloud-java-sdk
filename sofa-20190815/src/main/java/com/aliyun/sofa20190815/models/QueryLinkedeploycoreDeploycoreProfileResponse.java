// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreProfileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkedeploycoreDeploycoreProfileResponseBody body;

    public static QueryLinkedeploycoreDeploycoreProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreProfileResponse self = new QueryLinkedeploycoreDeploycoreProfileResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkedeploycoreDeploycoreProfileResponse setBody(QueryLinkedeploycoreDeploycoreProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreProfileResponseBody getBody() {
        return this.body;
    }

}
