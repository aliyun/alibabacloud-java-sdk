// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeSqlAuditInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeSqlAuditInfoResponse setBody(DescribeSqlAuditInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSqlAuditInfoResponseBody getBody() {
        return this.body;
    }

}
