// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOutlineBindingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOutlineBindingResponseBody body;

    public static DescribeOutlineBindingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutlineBindingResponse self = new DescribeOutlineBindingResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOutlineBindingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOutlineBindingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOutlineBindingResponse setBody(DescribeOutlineBindingResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOutlineBindingResponseBody getBody() {
        return this.body;
    }

}
