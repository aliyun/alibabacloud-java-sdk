// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
