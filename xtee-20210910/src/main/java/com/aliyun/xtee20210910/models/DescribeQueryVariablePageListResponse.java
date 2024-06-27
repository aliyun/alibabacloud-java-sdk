// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeQueryVariablePageListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeQueryVariablePageListResponseBody body;

    public static DescribeQueryVariablePageListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeQueryVariablePageListResponse self = new DescribeQueryVariablePageListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeQueryVariablePageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeQueryVariablePageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeQueryVariablePageListResponse setBody(DescribeQueryVariablePageListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeQueryVariablePageListResponseBody getBody() {
        return this.body;
    }

}
