// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyUserItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePropertyUserItemResponseBody body;

    public static DescribePropertyUserItemResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyUserItemResponse self = new DescribePropertyUserItemResponse();
        return TeaModel.build(map, self);
    }

    public DescribePropertyUserItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePropertyUserItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePropertyUserItemResponse setBody(DescribePropertyUserItemResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePropertyUserItemResponseBody getBody() {
        return this.body;
    }

}
