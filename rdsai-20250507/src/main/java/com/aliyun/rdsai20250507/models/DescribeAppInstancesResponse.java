// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeAppInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAppInstancesResponseBody body;

    public static DescribeAppInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppInstancesResponse self = new DescribeAppInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppInstancesResponse setBody(DescribeAppInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppInstancesResponseBody getBody() {
        return this.body;
    }

}
