// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifySecurityEventMarkMissIndividuallyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySecurityEventMarkMissIndividuallyResponseBody body;

    public static ModifySecurityEventMarkMissIndividuallyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityEventMarkMissIndividuallyResponse self = new ModifySecurityEventMarkMissIndividuallyResponse();
        return TeaModel.build(map, self);
    }

    public ModifySecurityEventMarkMissIndividuallyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySecurityEventMarkMissIndividuallyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySecurityEventMarkMissIndividuallyResponse setBody(ModifySecurityEventMarkMissIndividuallyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySecurityEventMarkMissIndividuallyResponseBody getBody() {
        return this.body;
    }

}
