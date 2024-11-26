// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class SmartqQueryAbilityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SmartqQueryAbilityResponseBody body;

    public static SmartqQueryAbilityResponse build(java.util.Map<String, ?> map) throws Exception {
        SmartqQueryAbilityResponse self = new SmartqQueryAbilityResponse();
        return TeaModel.build(map, self);
    }

    public SmartqQueryAbilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SmartqQueryAbilityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SmartqQueryAbilityResponse setBody(SmartqQueryAbilityResponseBody body) {
        this.body = body;
        return this;
    }
    public SmartqQueryAbilityResponseBody getBody() {
        return this.body;
    }

}
