// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDistributeTableListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDistributeTableListResponseBody body;

    public static DescribeDistributeTableListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDistributeTableListResponse self = new DescribeDistributeTableListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDistributeTableListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDistributeTableListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDistributeTableListResponse setBody(DescribeDistributeTableListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDistributeTableListResponseBody getBody() {
        return this.body;
    }

}
