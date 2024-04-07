// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeProductInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeProductInstancesResponseBody body;

    public static DescribeProductInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductInstancesResponse self = new DescribeProductInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProductInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProductInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProductInstancesResponse setBody(DescribeProductInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProductInstancesResponseBody getBody() {
        return this.body;
    }

}
