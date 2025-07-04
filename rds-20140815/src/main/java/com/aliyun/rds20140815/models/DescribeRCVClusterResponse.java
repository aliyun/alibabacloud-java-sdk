// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCVClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRCVClusterResponseBody body;

    public static DescribeRCVClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCVClusterResponse self = new DescribeRCVClusterResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRCVClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRCVClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRCVClusterResponse setBody(DescribeRCVClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRCVClusterResponseBody getBody() {
        return this.body;
    }

}
