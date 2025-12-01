// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeVariableVersionDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVariableVersionDetailResponseBody body;

    public static DescribeVariableVersionDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVariableVersionDetailResponse self = new DescribeVariableVersionDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVariableVersionDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVariableVersionDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVariableVersionDetailResponse setBody(DescribeVariableVersionDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVariableVersionDetailResponseBody getBody() {
        return this.body;
    }

}
