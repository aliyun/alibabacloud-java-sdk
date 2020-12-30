// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class QueryEndPointListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryEndPointListResponseBody body;

    public static QueryEndPointListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEndPointListResponse self = new QueryEndPointListResponse();
        return TeaModel.build(map, self);
    }

    public QueryEndPointListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEndPointListResponse setBody(QueryEndPointListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEndPointListResponseBody getBody() {
        return this.body;
    }

}
