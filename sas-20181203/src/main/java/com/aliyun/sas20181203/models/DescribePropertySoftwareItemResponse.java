// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertySoftwareItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePropertySoftwareItemResponseBody body;

    public static DescribePropertySoftwareItemResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertySoftwareItemResponse self = new DescribePropertySoftwareItemResponse();
        return TeaModel.build(map, self);
    }

    public DescribePropertySoftwareItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePropertySoftwareItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePropertySoftwareItemResponse setBody(DescribePropertySoftwareItemResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePropertySoftwareItemResponseBody getBody() {
        return this.body;
    }

}
