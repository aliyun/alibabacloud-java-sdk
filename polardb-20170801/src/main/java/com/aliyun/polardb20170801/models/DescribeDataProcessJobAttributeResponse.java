// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDataProcessJobAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataProcessJobAttributeResponseBody body;

    public static DescribeDataProcessJobAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataProcessJobAttributeResponse self = new DescribeDataProcessJobAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataProcessJobAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataProcessJobAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataProcessJobAttributeResponse setBody(DescribeDataProcessJobAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataProcessJobAttributeResponseBody getBody() {
        return this.body;
    }

}
