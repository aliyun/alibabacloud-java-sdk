// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeVServerGroupAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVServerGroupAttributeResponseBody body;

    public static DescribeVServerGroupAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVServerGroupAttributeResponse self = new DescribeVServerGroupAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVServerGroupAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVServerGroupAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVServerGroupAttributeResponse setBody(DescribeVServerGroupAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVServerGroupAttributeResponseBody getBody() {
        return this.body;
    }

}
