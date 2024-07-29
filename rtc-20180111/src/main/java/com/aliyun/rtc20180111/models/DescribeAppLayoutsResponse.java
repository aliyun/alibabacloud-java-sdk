// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppLayoutsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAppLayoutsResponseBody body;

    public static DescribeAppLayoutsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppLayoutsResponse self = new DescribeAppLayoutsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppLayoutsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppLayoutsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppLayoutsResponse setBody(DescribeAppLayoutsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppLayoutsResponseBody getBody() {
        return this.body;
    }

}
