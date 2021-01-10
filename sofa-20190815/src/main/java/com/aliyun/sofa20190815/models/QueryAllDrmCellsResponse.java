// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryAllDrmCellsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAllDrmCellsResponseBody body;

    public static QueryAllDrmCellsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAllDrmCellsResponse self = new QueryAllDrmCellsResponse();
        return TeaModel.build(map, self);
    }

    public QueryAllDrmCellsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAllDrmCellsResponse setBody(QueryAllDrmCellsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAllDrmCellsResponseBody getBody() {
        return this.body;
    }

}
