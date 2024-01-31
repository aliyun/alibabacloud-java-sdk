// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyProcItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePropertyProcItemResponseBody body;

    public static DescribePropertyProcItemResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyProcItemResponse self = new DescribePropertyProcItemResponse();
        return TeaModel.build(map, self);
    }

    public DescribePropertyProcItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePropertyProcItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePropertyProcItemResponse setBody(DescribePropertyProcItemResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePropertyProcItemResponseBody getBody() {
        return this.body;
    }

}
