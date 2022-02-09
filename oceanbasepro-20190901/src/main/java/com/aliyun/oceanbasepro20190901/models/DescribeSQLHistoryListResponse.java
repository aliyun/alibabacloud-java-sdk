// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSQLHistoryListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeSQLHistoryListResponse setBody(DescribeSQLHistoryListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLHistoryListResponseBody getBody() {
        return this.body;
    }

}
