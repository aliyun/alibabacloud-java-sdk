// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudClustersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHybridCloudClustersResponseBody body;

    public static DescribeHybridCloudClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudClustersResponse self = new DescribeHybridCloudClustersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHybridCloudClustersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHybridCloudClustersResponse setBody(DescribeHybridCloudClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHybridCloudClustersResponseBody getBody() {
        return this.body;
    }

}
