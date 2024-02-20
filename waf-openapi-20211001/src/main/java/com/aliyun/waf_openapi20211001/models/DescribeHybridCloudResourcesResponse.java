// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHybridCloudResourcesResponseBody body;

    public static DescribeHybridCloudResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudResourcesResponse self = new DescribeHybridCloudResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHybridCloudResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHybridCloudResourcesResponse setBody(DescribeHybridCloudResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHybridCloudResourcesResponseBody getBody() {
        return this.body;
    }

}
