// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyApplicationWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyApplicationWhitelistResponseBody body;

    public static ModifyApplicationWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApplicationWhitelistResponse self = new ModifyApplicationWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApplicationWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApplicationWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyApplicationWhitelistResponse setBody(ModifyApplicationWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApplicationWhitelistResponseBody getBody() {
        return this.body;
    }

}
