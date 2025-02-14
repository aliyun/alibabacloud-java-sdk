// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetInstanceAlarmStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceAlarmStatisticsResponseBody body;

    public static GetInstanceAlarmStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceAlarmStatisticsResponse self = new GetInstanceAlarmStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceAlarmStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceAlarmStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceAlarmStatisticsResponse setBody(GetInstanceAlarmStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceAlarmStatisticsResponseBody getBody() {
        return this.body;
    }

}
