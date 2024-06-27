// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeDataSourcePageListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataSourcePageListResponseBody body;

    public static DescribeDataSourcePageListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSourcePageListResponse self = new DescribeDataSourcePageListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataSourcePageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataSourcePageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataSourcePageListResponse setBody(DescribeDataSourcePageListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataSourcePageListResponseBody getBody() {
        return this.body;
    }

}
