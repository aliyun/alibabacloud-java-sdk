// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeInstanceSpecificationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceSpecificationsResponseBody body;

    public static DescribeInstanceSpecificationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSpecificationsResponse self = new DescribeInstanceSpecificationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSpecificationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceSpecificationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceSpecificationsResponse setBody(DescribeInstanceSpecificationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceSpecificationsResponseBody getBody() {
        return this.body;
    }

}
