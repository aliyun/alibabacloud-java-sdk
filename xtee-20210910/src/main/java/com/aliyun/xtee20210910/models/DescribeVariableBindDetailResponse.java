// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeVariableBindDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVariableBindDetailResponseBody body;

    public static DescribeVariableBindDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVariableBindDetailResponse self = new DescribeVariableBindDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVariableBindDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVariableBindDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVariableBindDetailResponse setBody(DescribeVariableBindDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVariableBindDetailResponseBody getBody() {
        return this.body;
    }

}
