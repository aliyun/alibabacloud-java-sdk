// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteAttackPathWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAttackPathWhitelistResponseBody body;

    public static DeleteAttackPathWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAttackPathWhitelistResponse self = new DeleteAttackPathWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAttackPathWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAttackPathWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAttackPathWhitelistResponse setBody(DeleteAttackPathWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAttackPathWhitelistResponseBody getBody() {
        return this.body;
    }

}
