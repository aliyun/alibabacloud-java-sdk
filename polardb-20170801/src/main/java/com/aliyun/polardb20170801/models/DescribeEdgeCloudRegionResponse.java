// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeEdgeCloudRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEdgeCloudRegionResponseBody body;

    public static DescribeEdgeCloudRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEdgeCloudRegionResponse self = new DescribeEdgeCloudRegionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEdgeCloudRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEdgeCloudRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEdgeCloudRegionResponse setBody(DescribeEdgeCloudRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEdgeCloudRegionResponseBody getBody() {
        return this.body;
    }

}
