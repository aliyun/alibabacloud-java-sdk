// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDomainPunishStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDomainPunishStatusResponseBody body;

    public static ModifyDomainPunishStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDomainPunishStatusResponse self = new ModifyDomainPunishStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDomainPunishStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDomainPunishStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDomainPunishStatusResponse setBody(ModifyDomainPunishStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDomainPunishStatusResponseBody getBody() {
        return this.body;
    }

}
