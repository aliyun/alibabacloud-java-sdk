// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectMhsproducttypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasInspectMhsproducttypeResponseBody body;

    public static QueryHasInspectMhsproducttypeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectMhsproducttypeResponse self = new QueryHasInspectMhsproducttypeResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectMhsproducttypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasInspectMhsproducttypeResponse setBody(QueryHasInspectMhsproducttypeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasInspectMhsproducttypeResponseBody getBody() {
        return this.body;
    }

}
