// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventBaseInfoByEventCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEventBaseInfoByEventCodeResponseBody body;

    public static DescribeEventBaseInfoByEventCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventBaseInfoByEventCodeResponse self = new DescribeEventBaseInfoByEventCodeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventBaseInfoByEventCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventBaseInfoByEventCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEventBaseInfoByEventCodeResponse setBody(DescribeEventBaseInfoByEventCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventBaseInfoByEventCodeResponseBody getBody() {
        return this.body;
    }

}
