// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class DescribeWorkgroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWorkgroupsResponseBody body;

    public static DescribeWorkgroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWorkgroupsResponse self = new DescribeWorkgroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWorkgroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWorkgroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWorkgroupsResponse setBody(DescribeWorkgroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWorkgroupsResponseBody getBody() {
        return this.body;
    }

}
