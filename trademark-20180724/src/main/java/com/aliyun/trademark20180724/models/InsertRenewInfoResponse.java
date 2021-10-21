// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class InsertRenewInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InsertRenewInfoResponseBody body;

    public static InsertRenewInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertRenewInfoResponse self = new InsertRenewInfoResponse();
        return TeaModel.build(map, self);
    }

    public InsertRenewInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertRenewInfoResponse setBody(InsertRenewInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertRenewInfoResponseBody getBody() {
        return this.body;
    }

}
