// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.savingplan20200715.models;

import com.aliyun.tea.*;

public class CalculateSavingsPlansResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CalculateSavingsPlansResponseBody body;

    public static CalculateSavingsPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        CalculateSavingsPlansResponse self = new CalculateSavingsPlansResponse();
        return TeaModel.build(map, self);
    }

    public CalculateSavingsPlansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CalculateSavingsPlansResponse setBody(CalculateSavingsPlansResponseBody body) {
        this.body = body;
        return this;
    }
    public CalculateSavingsPlansResponseBody getBody() {
        return this.body;
    }

}
