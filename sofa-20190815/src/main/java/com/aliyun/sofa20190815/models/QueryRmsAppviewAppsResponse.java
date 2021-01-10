// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAppviewAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsAppviewAppsResponseBody body;

    public static QueryRmsAppviewAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAppviewAppsResponse self = new QueryRmsAppviewAppsResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsAppviewAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsAppviewAppsResponse setBody(QueryRmsAppviewAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsAppviewAppsResponseBody getBody() {
        return this.body;
    }

}
