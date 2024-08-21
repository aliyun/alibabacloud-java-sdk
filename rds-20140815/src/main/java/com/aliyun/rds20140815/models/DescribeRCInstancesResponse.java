// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRCInstancesResponseBody body;

    public static DescribeRCInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCInstancesResponse self = new DescribeRCInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRCInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRCInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRCInstancesResponse setBody(DescribeRCInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRCInstancesResponseBody getBody() {
        return this.body;
    }

}
