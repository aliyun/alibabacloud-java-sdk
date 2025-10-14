// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeSqlAuditInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSqlAuditInfoResponseBody body;

    public static DescribeSqlAuditInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlAuditInfoResponse self = new DescribeSqlAuditInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSqlAuditInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSqlAuditInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSqlAuditInfoResponse setBody(DescribeSqlAuditInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSqlAuditInfoResponseBody getBody() {
        return this.body;
    }

}
