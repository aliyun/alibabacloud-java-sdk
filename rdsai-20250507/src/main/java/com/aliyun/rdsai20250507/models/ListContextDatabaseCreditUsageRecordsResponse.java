// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListContextDatabaseCreditUsageRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListContextDatabaseCreditUsageRecordsResponseBody body;

    public static ListContextDatabaseCreditUsageRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContextDatabaseCreditUsageRecordsResponse self = new ListContextDatabaseCreditUsageRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListContextDatabaseCreditUsageRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListContextDatabaseCreditUsageRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListContextDatabaseCreditUsageRecordsResponse setBody(ListContextDatabaseCreditUsageRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListContextDatabaseCreditUsageRecordsResponseBody getBody() {
        return this.body;
    }

}
