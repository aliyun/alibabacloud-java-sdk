// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeOssAuthStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOssAuthStatusResponseBody body;

    public static DescribeOssAuthStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssAuthStatusResponse self = new DescribeOssAuthStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOssAuthStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOssAuthStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOssAuthStatusResponse setBody(DescribeOssAuthStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOssAuthStatusResponseBody getBody() {
        return this.body;
    }

}
