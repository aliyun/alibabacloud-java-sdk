// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211124.models;

import com.aliyun.tea.*;

public class CreditServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreditServiceResponseBody body;

    public static CreditServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreditServiceResponse self = new CreditServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreditServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreditServiceResponse setBody(CreditServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreditServiceResponseBody getBody() {
        return this.body;
    }

}
