// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudServerRegionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHybridCloudServerRegionsResponseBody body;

    public static DescribeHybridCloudServerRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudServerRegionsResponse self = new DescribeHybridCloudServerRegionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudServerRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHybridCloudServerRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHybridCloudServerRegionsResponse setBody(DescribeHybridCloudServerRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHybridCloudServerRegionsResponseBody getBody() {
        return this.body;
    }

}
