// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOasTopSQLListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOasTopSQLListResponseBody body;

    public static DescribeOasTopSQLListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOasTopSQLListResponse self = new DescribeOasTopSQLListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOasTopSQLListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOasTopSQLListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOasTopSQLListResponse setBody(DescribeOasTopSQLListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOasTopSQLListResponseBody getBody() {
        return this.body;
    }

}
