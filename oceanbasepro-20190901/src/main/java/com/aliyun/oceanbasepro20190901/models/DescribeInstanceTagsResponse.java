// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceTagsResponseBody body;

    public static DescribeInstanceTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTagsResponse self = new DescribeInstanceTagsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceTagsResponse setBody(DescribeInstanceTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceTagsResponseBody getBody() {
        return this.body;
    }

}
