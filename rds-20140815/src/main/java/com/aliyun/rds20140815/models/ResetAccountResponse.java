// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ResetAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetAccountResponseBody body;

    public static ResetAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetAccountResponse self = new ResetAccountResponse();
        return TeaModel.build(map, self);
    }

    public ResetAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetAccountResponse setBody(ResetAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetAccountResponseBody getBody() {
        return this.body;
    }

}
