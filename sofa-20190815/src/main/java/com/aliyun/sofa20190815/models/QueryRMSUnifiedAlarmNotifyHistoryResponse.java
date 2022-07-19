// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRMSUnifiedAlarmNotifyHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRMSUnifiedAlarmNotifyHistoryResponseBody body;

    public static QueryRMSUnifiedAlarmNotifyHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRMSUnifiedAlarmNotifyHistoryResponse self = new QueryRMSUnifiedAlarmNotifyHistoryResponse();
        return TeaModel.build(map, self);
    }

    public QueryRMSUnifiedAlarmNotifyHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRMSUnifiedAlarmNotifyHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRMSUnifiedAlarmNotifyHistoryResponse setBody(QueryRMSUnifiedAlarmNotifyHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRMSUnifiedAlarmNotifyHistoryResponseBody getBody() {
        return this.body;
    }

}
