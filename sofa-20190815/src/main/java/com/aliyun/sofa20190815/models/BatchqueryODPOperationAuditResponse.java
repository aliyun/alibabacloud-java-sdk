// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryODPOperationAuditResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchqueryODPOperationAuditResponseBody body;

    public static BatchqueryODPOperationAuditResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryODPOperationAuditResponse self = new BatchqueryODPOperationAuditResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryODPOperationAuditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchqueryODPOperationAuditResponse setBody(BatchqueryODPOperationAuditResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchqueryODPOperationAuditResponseBody getBody() {
        return this.body;
    }

}
