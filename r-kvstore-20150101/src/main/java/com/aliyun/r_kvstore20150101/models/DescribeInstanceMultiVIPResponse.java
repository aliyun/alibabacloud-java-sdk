// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstanceMultiVIPResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceMultiVIPResponseBody body;

    public static DescribeInstanceMultiVIPResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMultiVIPResponse self = new DescribeInstanceMultiVIPResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceMultiVIPResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceMultiVIPResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceMultiVIPResponse setBody(DescribeInstanceMultiVIPResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceMultiVIPResponseBody getBody() {
        return this.body;
    }

}
