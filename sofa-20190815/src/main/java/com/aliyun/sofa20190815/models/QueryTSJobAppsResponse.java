// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSJobAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTSJobAppsResponseBody body;

    public static QueryTSJobAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTSJobAppsResponse self = new QueryTSJobAppsResponse();
        return TeaModel.build(map, self);
    }

    public QueryTSJobAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTSJobAppsResponse setBody(QueryTSJobAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTSJobAppsResponseBody getBody() {
        return this.body;
    }

}
