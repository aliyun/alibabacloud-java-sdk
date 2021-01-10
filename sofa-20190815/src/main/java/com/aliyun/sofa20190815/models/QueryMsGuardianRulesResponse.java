// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsGuardianRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsGuardianRulesResponseBody body;

    public static QueryMsGuardianRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsGuardianRulesResponse self = new QueryMsGuardianRulesResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsGuardianRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsGuardianRulesResponse setBody(QueryMsGuardianRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsGuardianRulesResponseBody getBody() {
        return this.body;
    }

}
