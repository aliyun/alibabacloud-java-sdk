// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCClustersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRCClustersResponseBody body;

    public static DescribeRCClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCClustersResponse self = new DescribeRCClustersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRCClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRCClustersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRCClustersResponse setBody(DescribeRCClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRCClustersResponseBody getBody() {
        return this.body;
    }

}
