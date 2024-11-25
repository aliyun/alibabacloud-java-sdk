// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCClusterConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRCClusterConfigResponseBody body;

    public static DescribeRCClusterConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCClusterConfigResponse self = new DescribeRCClusterConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRCClusterConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRCClusterConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRCClusterConfigResponse setBody(DescribeRCClusterConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRCClusterConfigResponseBody getBody() {
        return this.body;
    }

}
