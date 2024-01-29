// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeHistoryMonitorValuesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHistoryMonitorValuesResponseBody body;

    public static DescribeHistoryMonitorValuesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryMonitorValuesResponse self = new DescribeHistoryMonitorValuesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryMonitorValuesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHistoryMonitorValuesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHistoryMonitorValuesResponse setBody(DescribeHistoryMonitorValuesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHistoryMonitorValuesResponseBody getBody() {
        return this.body;
    }

}
