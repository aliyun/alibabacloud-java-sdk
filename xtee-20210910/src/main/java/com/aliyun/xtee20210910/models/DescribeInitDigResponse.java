// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeInitDigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInitDigResponseBody body;

    public static DescribeInitDigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInitDigResponse self = new DescribeInitDigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInitDigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInitDigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInitDigResponse setBody(DescribeInitDigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInitDigResponseBody getBody() {
        return this.body;
    }

}
