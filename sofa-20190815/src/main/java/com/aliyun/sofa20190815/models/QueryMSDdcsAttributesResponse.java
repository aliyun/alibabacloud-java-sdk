// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMSDdcsAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMSDdcsAttributesResponseBody body;

    public static QueryMSDdcsAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMSDdcsAttributesResponse self = new QueryMSDdcsAttributesResponse();
        return TeaModel.build(map, self);
    }

    public QueryMSDdcsAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMSDdcsAttributesResponse setBody(QueryMSDdcsAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMSDdcsAttributesResponseBody getBody() {
        return this.body;
    }

}
