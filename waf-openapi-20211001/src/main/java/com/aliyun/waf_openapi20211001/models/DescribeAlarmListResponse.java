// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAlarmListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAlarmListResponseBody body;

    public static DescribeAlarmListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmListResponse self = new DescribeAlarmListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlarmListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlarmListResponse setBody(DescribeAlarmListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlarmListResponseBody getBody() {
        return this.body;
    }

}
