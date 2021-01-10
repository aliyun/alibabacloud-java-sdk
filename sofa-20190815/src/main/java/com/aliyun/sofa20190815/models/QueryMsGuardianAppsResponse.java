// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsGuardianAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsGuardianAppsResponseBody body;

    public static QueryMsGuardianAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsGuardianAppsResponse self = new QueryMsGuardianAppsResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsGuardianAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsGuardianAppsResponse setBody(QueryMsGuardianAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsGuardianAppsResponseBody getBody() {
        return this.body;
    }

}
