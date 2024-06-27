// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAllDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAllDataSourceResponseBody body;

    public static DescribeAllDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllDataSourceResponse self = new DescribeAllDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAllDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAllDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAllDataSourceResponse setBody(DescribeAllDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAllDataSourceResponseBody getBody() {
        return this.body;
    }

}
