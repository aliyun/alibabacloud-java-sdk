// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudUnsupportPortsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHybridCloudUnsupportPortsResponseBody body;

    public static DescribeHybridCloudUnsupportPortsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudUnsupportPortsResponse self = new DescribeHybridCloudUnsupportPortsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudUnsupportPortsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHybridCloudUnsupportPortsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHybridCloudUnsupportPortsResponse setBody(DescribeHybridCloudUnsupportPortsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHybridCloudUnsupportPortsResponseBody getBody() {
        return this.body;
    }

}
