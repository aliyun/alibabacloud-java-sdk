// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetContextDatabaseCreditUsageSummaryByMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetContextDatabaseCreditUsageSummaryByMemberResponseBody body;

    public static GetContextDatabaseCreditUsageSummaryByMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContextDatabaseCreditUsageSummaryByMemberResponse self = new GetContextDatabaseCreditUsageSummaryByMemberResponse();
        return TeaModel.build(map, self);
    }

    public GetContextDatabaseCreditUsageSummaryByMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetContextDatabaseCreditUsageSummaryByMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetContextDatabaseCreditUsageSummaryByMemberResponse setBody(GetContextDatabaseCreditUsageSummaryByMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public GetContextDatabaseCreditUsageSummaryByMemberResponseBody getBody() {
        return this.body;
    }

}
