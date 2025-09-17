// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudSupportRegionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHybridCloudSupportRegionsResponseBody body;

    public static DescribeHybridCloudSupportRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudSupportRegionsResponse self = new DescribeHybridCloudSupportRegionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudSupportRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHybridCloudSupportRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHybridCloudSupportRegionsResponse setBody(DescribeHybridCloudSupportRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHybridCloudSupportRegionsResponseBody getBody() {
        return this.body;
    }

}
