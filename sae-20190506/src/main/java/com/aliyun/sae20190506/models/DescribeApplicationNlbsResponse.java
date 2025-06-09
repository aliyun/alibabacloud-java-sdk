// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationNlbsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApplicationNlbsResponseBody body;

    public static DescribeApplicationNlbsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationNlbsResponse self = new DescribeApplicationNlbsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationNlbsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationNlbsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApplicationNlbsResponse setBody(DescribeApplicationNlbsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationNlbsResponseBody getBody() {
        return this.body;
    }

}
