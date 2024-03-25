// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeEventDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEventDetailResponseBody body;

    public static DescribeEventDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventDetailResponse self = new DescribeEventDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEventDetailResponse setBody(DescribeEventDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventDetailResponseBody getBody() {
        return this.body;
    }

}
