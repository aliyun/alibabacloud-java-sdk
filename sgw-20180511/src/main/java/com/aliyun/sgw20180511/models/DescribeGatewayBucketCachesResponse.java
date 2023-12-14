// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayBucketCachesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewayBucketCachesResponseBody body;

    public static DescribeGatewayBucketCachesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayBucketCachesResponse self = new DescribeGatewayBucketCachesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayBucketCachesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayBucketCachesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGatewayBucketCachesResponse setBody(DescribeGatewayBucketCachesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayBucketCachesResponseBody getBody() {
        return this.body;
    }

}
