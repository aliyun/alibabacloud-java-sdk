// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAlarmEventStackInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAlarmEventStackInfoResponseBody body;

    public static DescribeAlarmEventStackInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmEventStackInfoResponse self = new DescribeAlarmEventStackInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmEventStackInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlarmEventStackInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAlarmEventStackInfoResponse setBody(DescribeAlarmEventStackInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlarmEventStackInfoResponseBody getBody() {
        return this.body;
    }

}
