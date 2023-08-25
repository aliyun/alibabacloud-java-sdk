// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOasSQLHistoryListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOasSQLHistoryListResponseBody body;

    public static DescribeOasSQLHistoryListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOasSQLHistoryListResponse self = new DescribeOasSQLHistoryListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOasSQLHistoryListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOasSQLHistoryListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOasSQLHistoryListResponse setBody(DescribeOasSQLHistoryListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOasSQLHistoryListResponseBody getBody() {
        return this.body;
    }

}
