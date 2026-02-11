// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class ApplyBastionAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyBastionAccountResponseBody body;

    public static ApplyBastionAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyBastionAccountResponse self = new ApplyBastionAccountResponse();
        return TeaModel.build(map, self);
    }

    public ApplyBastionAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyBastionAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyBastionAccountResponse setBody(ApplyBastionAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyBastionAccountResponseBody getBody() {
        return this.body;
    }

}
