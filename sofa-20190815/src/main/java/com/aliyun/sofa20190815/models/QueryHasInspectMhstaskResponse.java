// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectMhstaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasInspectMhstaskResponseBody body;

    public static QueryHasInspectMhstaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectMhstaskResponse self = new QueryHasInspectMhstaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectMhstaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasInspectMhstaskResponse setBody(QueryHasInspectMhstaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasInspectMhstaskResponseBody getBody() {
        return this.body;
    }

}
