// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreResourcequerypodeventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkedeploycoreDeploycoreResourcequerypodeventsResponseBody body;

    public static QueryLinkedeploycoreDeploycoreResourcequerypodeventsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreResourcequerypodeventsResponse self = new QueryLinkedeploycoreDeploycoreResourcequerypodeventsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreResourcequerypodeventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkedeploycoreDeploycoreResourcequerypodeventsResponse setBody(QueryLinkedeploycoreDeploycoreResourcequerypodeventsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreResourcequerypodeventsResponseBody getBody() {
        return this.body;
    }

}
