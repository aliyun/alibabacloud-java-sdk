// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudClusterServersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHybridCloudClusterServersResponseBody body;

    public static DescribeHybridCloudClusterServersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudClusterServersResponse self = new DescribeHybridCloudClusterServersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudClusterServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHybridCloudClusterServersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHybridCloudClusterServersResponse setBody(DescribeHybridCloudClusterServersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHybridCloudClusterServersResponseBody getBody() {
        return this.body;
    }

}
