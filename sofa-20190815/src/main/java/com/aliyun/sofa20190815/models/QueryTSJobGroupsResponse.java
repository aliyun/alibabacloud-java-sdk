// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSJobGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTSJobGroupsResponseBody body;

    public static QueryTSJobGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTSJobGroupsResponse self = new QueryTSJobGroupsResponse();
        return TeaModel.build(map, self);
    }

    public QueryTSJobGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTSJobGroupsResponse setBody(QueryTSJobGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTSJobGroupsResponseBody getBody() {
        return this.body;
    }

}
