// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsGuardianRulePushHistorysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsGuardianRulePushHistorysResponseBody body;

    public static QueryMsGuardianRulePushHistorysResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsGuardianRulePushHistorysResponse self = new QueryMsGuardianRulePushHistorysResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsGuardianRulePushHistorysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsGuardianRulePushHistorysResponse setBody(QueryMsGuardianRulePushHistorysResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsGuardianRulePushHistorysResponseBody getBody() {
        return this.body;
    }

}
