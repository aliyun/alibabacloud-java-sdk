// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyMajorProtectionBlackIpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyMajorProtectionBlackIpResponseBody body;

    public static ModifyMajorProtectionBlackIpResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMajorProtectionBlackIpResponse self = new ModifyMajorProtectionBlackIpResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMajorProtectionBlackIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMajorProtectionBlackIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMajorProtectionBlackIpResponse setBody(ModifyMajorProtectionBlackIpResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMajorProtectionBlackIpResponseBody getBody() {
        return this.body;
    }

}
