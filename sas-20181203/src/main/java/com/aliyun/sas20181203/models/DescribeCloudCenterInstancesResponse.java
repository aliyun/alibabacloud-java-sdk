// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCloudCenterInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudCenterInstancesResponseBody body;

    public static DescribeCloudCenterInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudCenterInstancesResponse self = new DescribeCloudCenterInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudCenterInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudCenterInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudCenterInstancesResponse setBody(DescribeCloudCenterInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudCenterInstancesResponseBody getBody() {
        return this.body;
    }

}
