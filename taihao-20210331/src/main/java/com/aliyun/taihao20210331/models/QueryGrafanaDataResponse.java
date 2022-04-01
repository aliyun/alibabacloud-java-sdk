// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class QueryGrafanaDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryGrafanaDataResponseBody body;

    public static QueryGrafanaDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGrafanaDataResponse self = new QueryGrafanaDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryGrafanaDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryGrafanaDataResponse setBody(QueryGrafanaDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryGrafanaDataResponseBody getBody() {
        return this.body;
    }

}
