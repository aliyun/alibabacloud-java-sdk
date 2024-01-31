// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyUserDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePropertyUserDetailResponseBody body;

    public static DescribePropertyUserDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyUserDetailResponse self = new DescribePropertyUserDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribePropertyUserDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePropertyUserDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePropertyUserDetailResponse setBody(DescribePropertyUserDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePropertyUserDetailResponseBody getBody() {
        return this.body;
    }

}
