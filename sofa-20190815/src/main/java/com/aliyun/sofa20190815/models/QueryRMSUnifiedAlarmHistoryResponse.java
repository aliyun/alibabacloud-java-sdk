// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRMSUnifiedAlarmHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRMSUnifiedAlarmHistoryResponseBody body;

    public static QueryRMSUnifiedAlarmHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRMSUnifiedAlarmHistoryResponse self = new QueryRMSUnifiedAlarmHistoryResponse();
        return TeaModel.build(map, self);
    }

    public QueryRMSUnifiedAlarmHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRMSUnifiedAlarmHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRMSUnifiedAlarmHistoryResponse setBody(QueryRMSUnifiedAlarmHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRMSUnifiedAlarmHistoryResponseBody getBody() {
        return this.body;
    }

}
