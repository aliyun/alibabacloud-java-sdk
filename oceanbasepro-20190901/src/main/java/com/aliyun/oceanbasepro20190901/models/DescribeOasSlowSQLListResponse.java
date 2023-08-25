// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOasSlowSQLListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOasSlowSQLListResponseBody body;

    public static DescribeOasSlowSQLListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOasSlowSQLListResponse self = new DescribeOasSlowSQLListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOasSlowSQLListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOasSlowSQLListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOasSlowSQLListResponse setBody(DescribeOasSlowSQLListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOasSlowSQLListResponseBody getBody() {
        return this.body;
    }

}
