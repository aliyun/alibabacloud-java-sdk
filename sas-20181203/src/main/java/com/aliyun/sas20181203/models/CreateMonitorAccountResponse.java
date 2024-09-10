// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateMonitorAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMonitorAccountResponseBody body;

    public static CreateMonitorAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorAccountResponse self = new CreateMonitorAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateMonitorAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMonitorAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMonitorAccountResponse setBody(CreateMonitorAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMonitorAccountResponseBody getBody() {
        return this.body;
    }

}
