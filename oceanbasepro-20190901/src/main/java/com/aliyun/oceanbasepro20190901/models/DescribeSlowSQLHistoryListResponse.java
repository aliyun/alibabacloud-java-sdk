// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSlowSQLHistoryListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSlowSQLHistoryListResponseBody body;

    public static DescribeSlowSQLHistoryListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowSQLHistoryListResponse self = new DescribeSlowSQLHistoryListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlowSQLHistoryListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlowSQLHistoryListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSlowSQLHistoryListResponse setBody(DescribeSlowSQLHistoryListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlowSQLHistoryListResponseBody getBody() {
        return this.body;
    }

}
