// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QuerySofamqCellByCellTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySofamqCellByCellTypeResponseBody body;

    public static QuerySofamqCellByCellTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqCellByCellTypeResponse self = new QuerySofamqCellByCellTypeResponse();
        return TeaModel.build(map, self);
    }

    public QuerySofamqCellByCellTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySofamqCellByCellTypeResponse setBody(QuerySofamqCellByCellTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySofamqCellByCellTypeResponseBody getBody() {
        return this.body;
    }

}
