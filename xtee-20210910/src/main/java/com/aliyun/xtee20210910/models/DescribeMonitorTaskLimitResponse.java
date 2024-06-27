// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeMonitorTaskLimitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMonitorTaskLimitResponseBody body;

    public static DescribeMonitorTaskLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorTaskLimitResponse self = new DescribeMonitorTaskLimitResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorTaskLimitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMonitorTaskLimitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMonitorTaskLimitResponse setBody(DescribeMonitorTaskLimitResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMonitorTaskLimitResponseBody getBody() {
        return this.body;
    }

}
