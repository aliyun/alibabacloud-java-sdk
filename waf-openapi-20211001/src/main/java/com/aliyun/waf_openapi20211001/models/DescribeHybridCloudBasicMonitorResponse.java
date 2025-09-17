// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudBasicMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHybridCloudBasicMonitorResponseBody body;

    public static DescribeHybridCloudBasicMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudBasicMonitorResponse self = new DescribeHybridCloudBasicMonitorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudBasicMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHybridCloudBasicMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHybridCloudBasicMonitorResponse setBody(DescribeHybridCloudBasicMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHybridCloudBasicMonitorResponseBody getBody() {
        return this.body;
    }

}
