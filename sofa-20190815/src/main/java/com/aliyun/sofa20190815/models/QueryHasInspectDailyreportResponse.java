// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectDailyreportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasInspectDailyreportResponseBody body;

    public static QueryHasInspectDailyreportResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectDailyreportResponse self = new QueryHasInspectDailyreportResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectDailyreportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasInspectDailyreportResponse setBody(QueryHasInspectDailyreportResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasInspectDailyreportResponseBody getBody() {
        return this.body;
    }

}
