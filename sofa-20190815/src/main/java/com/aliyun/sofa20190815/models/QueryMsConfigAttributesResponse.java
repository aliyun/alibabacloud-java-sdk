// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsConfigAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsConfigAttributesResponseBody body;

    public static QueryMsConfigAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsConfigAttributesResponse self = new QueryMsConfigAttributesResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsConfigAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsConfigAttributesResponse setBody(QueryMsConfigAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsConfigAttributesResponseBody getBody() {
        return this.body;
    }

}
