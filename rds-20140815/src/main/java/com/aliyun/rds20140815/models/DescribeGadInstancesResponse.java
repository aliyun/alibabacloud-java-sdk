// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeGadInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGadInstancesResponseBody body;

    public static DescribeGadInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGadInstancesResponse self = new DescribeGadInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGadInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGadInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGadInstancesResponse setBody(DescribeGadInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGadInstancesResponseBody getBody() {
        return this.body;
    }

}
