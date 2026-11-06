// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDataProcessJobTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataProcessJobTemplatesResponseBody body;

    public static DescribeDataProcessJobTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataProcessJobTemplatesResponse self = new DescribeDataProcessJobTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataProcessJobTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataProcessJobTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataProcessJobTemplatesResponse setBody(DescribeDataProcessJobTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataProcessJobTemplatesResponseBody getBody() {
        return this.body;
    }

}
