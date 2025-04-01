// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSqlAuditStatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSqlAuditStatResponseBody body;

    public static DescribeSqlAuditStatResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlAuditStatResponse self = new DescribeSqlAuditStatResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSqlAuditStatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSqlAuditStatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSqlAuditStatResponse setBody(DescribeSqlAuditStatResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSqlAuditStatResponseBody getBody() {
        return this.body;
    }

}
