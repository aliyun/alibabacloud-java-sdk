// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSQLHistoryListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSQLHistoryListResponseBody body;

    public static DescribeSQLHistoryListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLHistoryListResponse self = new DescribeSQLHistoryListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLHistoryListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSQLHistoryListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSQLHistoryListResponse setBody(DescribeSQLHistoryListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLHistoryListResponseBody getBody() {
        return this.body;
    }

}
