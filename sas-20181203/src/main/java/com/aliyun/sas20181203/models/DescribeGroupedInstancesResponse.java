// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGroupedInstancesResponseBody body;

    public static DescribeGroupedInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupedInstancesResponse self = new DescribeGroupedInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGroupedInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGroupedInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGroupedInstancesResponse setBody(DescribeGroupedInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGroupedInstancesResponseBody getBody() {
        return this.body;
    }

}
