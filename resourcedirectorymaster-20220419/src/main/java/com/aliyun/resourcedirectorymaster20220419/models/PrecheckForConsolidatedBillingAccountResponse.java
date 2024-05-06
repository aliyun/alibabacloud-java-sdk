// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class PrecheckForConsolidatedBillingAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PrecheckForConsolidatedBillingAccountResponseBody body;

    public static PrecheckForConsolidatedBillingAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        PrecheckForConsolidatedBillingAccountResponse self = new PrecheckForConsolidatedBillingAccountResponse();
        return TeaModel.build(map, self);
    }

    public PrecheckForConsolidatedBillingAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PrecheckForConsolidatedBillingAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PrecheckForConsolidatedBillingAccountResponse setBody(PrecheckForConsolidatedBillingAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public PrecheckForConsolidatedBillingAccountResponseBody getBody() {
        return this.body;
    }

}
