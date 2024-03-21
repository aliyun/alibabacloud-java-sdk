// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class DescribeSupplementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSupplementResponseBody body;

    public static DescribeSupplementResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupplementResponse self = new DescribeSupplementResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSupplementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSupplementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSupplementResponse setBody(DescribeSupplementResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSupplementResponseBody getBody() {
        return this.body;
    }

}
