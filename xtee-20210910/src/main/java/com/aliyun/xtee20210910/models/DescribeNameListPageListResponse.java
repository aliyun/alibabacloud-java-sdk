// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeNameListPageListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNameListPageListResponseBody body;

    public static DescribeNameListPageListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNameListPageListResponse self = new DescribeNameListPageListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNameListPageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNameListPageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNameListPageListResponse setBody(DescribeNameListPageListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNameListPageListResponseBody getBody() {
        return this.body;
    }

}
