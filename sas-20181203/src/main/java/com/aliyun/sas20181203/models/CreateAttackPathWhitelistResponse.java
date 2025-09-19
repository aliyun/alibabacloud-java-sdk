// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateAttackPathWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAttackPathWhitelistResponseBody body;

    public static CreateAttackPathWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAttackPathWhitelistResponse self = new CreateAttackPathWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public CreateAttackPathWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAttackPathWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAttackPathWhitelistResponse setBody(CreateAttackPathWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAttackPathWhitelistResponseBody getBody() {
        return this.body;
    }

}
