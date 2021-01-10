// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSJobGroupNamesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTSJobGroupNamesResponseBody body;

    public static QueryTSJobGroupNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTSJobGroupNamesResponse self = new QueryTSJobGroupNamesResponse();
        return TeaModel.build(map, self);
    }

    public QueryTSJobGroupNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTSJobGroupNamesResponse setBody(QueryTSJobGroupNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTSJobGroupNamesResponseBody getBody() {
        return this.body;
    }

}
