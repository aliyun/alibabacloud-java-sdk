// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeNameListVariablePageListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNameListVariablePageListResponseBody body;

    public static DescribeNameListVariablePageListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNameListVariablePageListResponse self = new DescribeNameListVariablePageListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNameListVariablePageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNameListVariablePageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNameListVariablePageListResponse setBody(DescribeNameListVariablePageListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNameListVariablePageListResponseBody getBody() {
        return this.body;
    }

}
