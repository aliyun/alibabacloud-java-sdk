// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCCellResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLDCCellResponseBody body;

    public static QueryLDCCellResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCCellResponse self = new QueryLDCCellResponse();
        return TeaModel.build(map, self);
    }

    public QueryLDCCellResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLDCCellResponse setBody(QueryLDCCellResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLDCCellResponseBody getBody() {
        return this.body;
    }

}
