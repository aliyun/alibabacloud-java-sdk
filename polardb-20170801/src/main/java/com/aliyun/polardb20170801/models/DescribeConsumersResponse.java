// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeConsumersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeConsumersResponseBody body;

    public static DescribeConsumersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsumersResponse self = new DescribeConsumersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConsumersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConsumersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeConsumersResponse setBody(DescribeConsumersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConsumersResponseBody getBody() {
        return this.body;
    }

}
