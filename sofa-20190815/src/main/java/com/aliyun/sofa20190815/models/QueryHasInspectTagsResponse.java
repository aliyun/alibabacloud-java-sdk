// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasInspectTagsResponseBody body;

    public static QueryHasInspectTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectTagsResponse self = new QueryHasInspectTagsResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasInspectTagsResponse setBody(QueryHasInspectTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasInspectTagsResponseBody getBody() {
        return this.body;
    }

}
