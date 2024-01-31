// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyScaItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePropertyScaItemResponseBody body;

    public static DescribePropertyScaItemResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyScaItemResponse self = new DescribePropertyScaItemResponse();
        return TeaModel.build(map, self);
    }

    public DescribePropertyScaItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePropertyScaItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePropertyScaItemResponse setBody(DescribePropertyScaItemResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePropertyScaItemResponseBody getBody() {
        return this.body;
    }

}
