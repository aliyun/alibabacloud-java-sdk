// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreResourcequeryappserviceidserviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkedeploycoreDeploycoreResourcequeryappserviceidserviceResponseBody body;

    public static QueryLinkedeploycoreDeploycoreResourcequeryappserviceidserviceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreResourcequeryappserviceidserviceResponse self = new QueryLinkedeploycoreDeploycoreResourcequeryappserviceidserviceResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreResourcequeryappserviceidserviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkedeploycoreDeploycoreResourcequeryappserviceidserviceResponse setBody(QueryLinkedeploycoreDeploycoreResourcequeryappserviceidserviceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreResourcequeryappserviceidserviceResponseBody getBody() {
        return this.body;
    }

}
