// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyCronItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePropertyCronItemResponseBody body;

    public static DescribePropertyCronItemResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyCronItemResponse self = new DescribePropertyCronItemResponse();
        return TeaModel.build(map, self);
    }

    public DescribePropertyCronItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePropertyCronItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePropertyCronItemResponse setBody(DescribePropertyCronItemResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePropertyCronItemResponseBody getBody() {
        return this.body;
    }

}
