// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAlarmHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsAlarmHistoryResponseBody body;

    public static QueryRmsAlarmHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlarmHistoryResponse self = new QueryRmsAlarmHistoryResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlarmHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsAlarmHistoryResponse setBody(QueryRmsAlarmHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsAlarmHistoryResponseBody getBody() {
        return this.body;
    }

}
