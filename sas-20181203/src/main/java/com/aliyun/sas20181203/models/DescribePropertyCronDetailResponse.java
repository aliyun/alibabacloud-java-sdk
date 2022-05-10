// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyCronDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePropertyCronDetailResponseBody body;

    public static DescribePropertyCronDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyCronDetailResponse self = new DescribePropertyCronDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribePropertyCronDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePropertyCronDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePropertyCronDetailResponse setBody(DescribePropertyCronDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePropertyCronDetailResponseBody getBody() {
        return this.body;
    }

}
