// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataSourceResponseBody body;

    public static DescribeDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSourceResponse self = new DescribeDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataSourceResponse setBody(DescribeDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataSourceResponseBody getBody() {
        return this.body;
    }

}
