// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetExpenseSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetExpenseSummaryResponseBody body;

    public static GetExpenseSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExpenseSummaryResponse self = new GetExpenseSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetExpenseSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExpenseSummaryResponse setBody(GetExpenseSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExpenseSummaryResponseBody getBody() {
        return this.body;
    }

}
