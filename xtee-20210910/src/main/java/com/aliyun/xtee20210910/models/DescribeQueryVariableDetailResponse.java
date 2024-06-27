// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeQueryVariableDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeQueryVariableDetailResponseBody body;

    public static DescribeQueryVariableDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeQueryVariableDetailResponse self = new DescribeQueryVariableDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeQueryVariableDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeQueryVariableDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeQueryVariableDetailResponse setBody(DescribeQueryVariableDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeQueryVariableDetailResponseBody getBody() {
        return this.body;
    }

}
