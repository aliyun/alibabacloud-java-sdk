// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListAlarmHistoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAlarmHistoriesResponseBody body;

    public static ListAlarmHistoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmHistoriesResponse self = new ListAlarmHistoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListAlarmHistoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlarmHistoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAlarmHistoriesResponse setBody(ListAlarmHistoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlarmHistoriesResponseBody getBody() {
        return this.body;
    }

}
