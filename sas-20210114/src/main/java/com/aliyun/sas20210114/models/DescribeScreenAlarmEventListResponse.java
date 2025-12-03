// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenAlarmEventListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScreenAlarmEventListResponseBody body;

    public static DescribeScreenAlarmEventListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenAlarmEventListResponse self = new DescribeScreenAlarmEventListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScreenAlarmEventListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScreenAlarmEventListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScreenAlarmEventListResponse setBody(DescribeScreenAlarmEventListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScreenAlarmEventListResponseBody getBody() {
        return this.body;
    }

}
