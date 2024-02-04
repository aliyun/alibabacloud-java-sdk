// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTopSQLListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTopSQLListResponseBody body;

    public static DescribeTopSQLListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopSQLListResponse self = new DescribeTopSQLListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTopSQLListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTopSQLListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTopSQLListResponse setBody(DescribeTopSQLListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTopSQLListResponseBody getBody() {
        return this.body;
    }

}
