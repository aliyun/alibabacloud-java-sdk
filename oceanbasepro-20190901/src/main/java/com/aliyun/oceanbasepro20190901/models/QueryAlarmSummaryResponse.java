// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class QueryAlarmSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAlarmSummaryResponseBody body;

    public static QueryAlarmSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAlarmSummaryResponse self = new QueryAlarmSummaryResponse();
        return TeaModel.build(map, self);
    }

    public QueryAlarmSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAlarmSummaryResponse setBody(QueryAlarmSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAlarmSummaryResponseBody getBody() {
        return this.body;
    }

}
