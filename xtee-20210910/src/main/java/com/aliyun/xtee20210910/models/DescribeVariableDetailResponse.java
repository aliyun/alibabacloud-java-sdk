// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeVariableDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVariableDetailResponseBody body;

    public static DescribeVariableDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVariableDetailResponse self = new DescribeVariableDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVariableDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVariableDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVariableDetailResponse setBody(DescribeVariableDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVariableDetailResponseBody getBody() {
        return this.body;
    }

}
