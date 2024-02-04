// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSlowSQLListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSlowSQLListResponseBody body;

    public static DescribeSlowSQLListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowSQLListResponse self = new DescribeSlowSQLListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlowSQLListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlowSQLListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSlowSQLListResponse setBody(DescribeSlowSQLListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlowSQLListResponseBody getBody() {
        return this.body;
    }

}
