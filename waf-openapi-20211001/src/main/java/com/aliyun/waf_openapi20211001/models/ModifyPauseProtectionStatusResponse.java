// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyPauseProtectionStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPauseProtectionStatusResponseBody body;

    public static ModifyPauseProtectionStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPauseProtectionStatusResponse self = new ModifyPauseProtectionStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPauseProtectionStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPauseProtectionStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPauseProtectionStatusResponse setBody(ModifyPauseProtectionStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPauseProtectionStatusResponseBody getBody() {
        return this.body;
    }

}
