// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeOpenSearchInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOpenSearchInstancesResponseBody body;

    public static DescribeOpenSearchInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenSearchInstancesResponse self = new DescribeOpenSearchInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOpenSearchInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOpenSearchInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOpenSearchInstancesResponse setBody(DescribeOpenSearchInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOpenSearchInstancesResponseBody getBody() {
        return this.body;
    }

}
