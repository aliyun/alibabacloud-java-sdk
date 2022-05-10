// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyPortDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePropertyPortDetailResponseBody body;

    public static DescribePropertyPortDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyPortDetailResponse self = new DescribePropertyPortDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribePropertyPortDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePropertyPortDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePropertyPortDetailResponse setBody(DescribePropertyPortDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePropertyPortDetailResponseBody getBody() {
        return this.body;
    }

}
