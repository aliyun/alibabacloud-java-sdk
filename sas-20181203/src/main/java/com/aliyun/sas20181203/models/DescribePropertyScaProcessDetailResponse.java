// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyScaProcessDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePropertyScaProcessDetailResponseBody body;

    public static DescribePropertyScaProcessDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyScaProcessDetailResponse self = new DescribePropertyScaProcessDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribePropertyScaProcessDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePropertyScaProcessDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePropertyScaProcessDetailResponse setBody(DescribePropertyScaProcessDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePropertyScaProcessDetailResponseBody getBody() {
        return this.body;
    }

}
