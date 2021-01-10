// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAlarmMetricResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsAlarmMetricResponseBody body;

    public static QueryRmsAlarmMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlarmMetricResponse self = new QueryRmsAlarmMetricResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlarmMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsAlarmMetricResponse setBody(QueryRmsAlarmMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsAlarmMetricResponseBody getBody() {
        return this.body;
    }

}
