// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryAllDrmAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAllDrmAppsResponseBody body;

    public static QueryAllDrmAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAllDrmAppsResponse self = new QueryAllDrmAppsResponse();
        return TeaModel.build(map, self);
    }

    public QueryAllDrmAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAllDrmAppsResponse setBody(QueryAllDrmAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAllDrmAppsResponseBody getBody() {
        return this.body;
    }

}
