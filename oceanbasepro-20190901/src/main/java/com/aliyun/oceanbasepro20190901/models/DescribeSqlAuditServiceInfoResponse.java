// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSqlAuditServiceInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSqlAuditServiceInfoResponseBody body;

    public static DescribeSqlAuditServiceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlAuditServiceInfoResponse self = new DescribeSqlAuditServiceInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSqlAuditServiceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSqlAuditServiceInfoResponse setBody(DescribeSqlAuditServiceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSqlAuditServiceInfoResponseBody getBody() {
        return this.body;
    }

}
