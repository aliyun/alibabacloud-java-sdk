// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeDataSourceFieldsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataSourceFieldsResponseBody body;

    public static DescribeDataSourceFieldsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSourceFieldsResponse self = new DescribeDataSourceFieldsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataSourceFieldsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataSourceFieldsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataSourceFieldsResponse setBody(DescribeDataSourceFieldsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataSourceFieldsResponseBody getBody() {
        return this.body;
    }

}
