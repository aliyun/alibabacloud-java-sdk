// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeFieldResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFieldResponseBody body;

    public static DescribeFieldResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFieldResponse self = new DescribeFieldResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFieldResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFieldResponse setBody(DescribeFieldResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFieldResponseBody getBody() {
        return this.body;
    }

}
