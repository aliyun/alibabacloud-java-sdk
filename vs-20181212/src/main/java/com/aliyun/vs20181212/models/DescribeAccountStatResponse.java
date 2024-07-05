// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeAccountStatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAccountStatResponseBody body;

    public static DescribeAccountStatResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountStatResponse self = new DescribeAccountStatResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccountStatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccountStatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAccountStatResponse setBody(DescribeAccountStatResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccountStatResponseBody getBody() {
        return this.body;
    }

}
