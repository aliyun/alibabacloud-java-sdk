// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryAllMsDrmLdcCellsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAllMsDrmLdcCellsResponseBody body;

    public static QueryAllMsDrmLdcCellsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAllMsDrmLdcCellsResponse self = new QueryAllMsDrmLdcCellsResponse();
        return TeaModel.build(map, self);
    }

    public QueryAllMsDrmLdcCellsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAllMsDrmLdcCellsResponse setBody(QueryAllMsDrmLdcCellsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAllMsDrmLdcCellsResponseBody getBody() {
        return this.body;
    }

}
