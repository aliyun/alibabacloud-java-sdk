// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetContextDatabaseCreditUsageSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetContextDatabaseCreditUsageSummaryResponseBody body;

    public static GetContextDatabaseCreditUsageSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContextDatabaseCreditUsageSummaryResponse self = new GetContextDatabaseCreditUsageSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetContextDatabaseCreditUsageSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetContextDatabaseCreditUsageSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetContextDatabaseCreditUsageSummaryResponse setBody(GetContextDatabaseCreditUsageSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetContextDatabaseCreditUsageSummaryResponseBody getBody() {
        return this.body;
    }

}
