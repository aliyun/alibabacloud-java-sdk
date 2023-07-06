// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class QueryAlarmDataListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAlarmDataListResponseBody body;

    public static QueryAlarmDataListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAlarmDataListResponse self = new QueryAlarmDataListResponse();
        return TeaModel.build(map, self);
    }

    public QueryAlarmDataListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAlarmDataListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAlarmDataListResponse setBody(QueryAlarmDataListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAlarmDataListResponseBody getBody() {
        return this.body;
    }

}
