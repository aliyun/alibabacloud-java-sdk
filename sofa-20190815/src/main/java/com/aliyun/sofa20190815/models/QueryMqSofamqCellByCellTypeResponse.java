// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqCellByCellTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMqSofamqCellByCellTypeResponseBody body;

    public static QueryMqSofamqCellByCellTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqCellByCellTypeResponse self = new QueryMqSofamqCellByCellTypeResponse();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqCellByCellTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMqSofamqCellByCellTypeResponse setBody(QueryMqSofamqCellByCellTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMqSofamqCellByCellTypeResponseBody getBody() {
        return this.body;
    }

}
