// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRMSUnifiedAlarmEventResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRMSUnifiedAlarmEventResponseBody body;

    public static QueryRMSUnifiedAlarmEventResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRMSUnifiedAlarmEventResponse self = new QueryRMSUnifiedAlarmEventResponse();
        return TeaModel.build(map, self);
    }

    public QueryRMSUnifiedAlarmEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRMSUnifiedAlarmEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRMSUnifiedAlarmEventResponse setBody(QueryRMSUnifiedAlarmEventResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRMSUnifiedAlarmEventResponseBody getBody() {
        return this.body;
    }

}
