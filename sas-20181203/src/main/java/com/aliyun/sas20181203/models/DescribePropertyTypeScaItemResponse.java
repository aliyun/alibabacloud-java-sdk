// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyTypeScaItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePropertyTypeScaItemResponseBody body;

    public static DescribePropertyTypeScaItemResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyTypeScaItemResponse self = new DescribePropertyTypeScaItemResponse();
        return TeaModel.build(map, self);
    }

    public DescribePropertyTypeScaItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePropertyTypeScaItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePropertyTypeScaItemResponse setBody(DescribePropertyTypeScaItemResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePropertyTypeScaItemResponseBody getBody() {
        return this.body;
    }

}
