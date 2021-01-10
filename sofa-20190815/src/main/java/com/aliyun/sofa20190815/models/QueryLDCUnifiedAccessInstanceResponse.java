// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCUnifiedAccessInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLDCUnifiedAccessInstanceResponseBody body;

    public static QueryLDCUnifiedAccessInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCUnifiedAccessInstanceResponse self = new QueryLDCUnifiedAccessInstanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryLDCUnifiedAccessInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLDCUnifiedAccessInstanceResponse setBody(QueryLDCUnifiedAccessInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLDCUnifiedAccessInstanceResponseBody getBody() {
        return this.body;
    }

}
