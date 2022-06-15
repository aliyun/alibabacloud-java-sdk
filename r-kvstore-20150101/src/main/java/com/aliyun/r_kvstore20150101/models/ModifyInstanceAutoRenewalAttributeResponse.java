// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceAutoRenewalAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyInstanceAutoRenewalAttributeResponseBody body;

    public static ModifyInstanceAutoRenewalAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAutoRenewalAttributeResponse self = new ModifyInstanceAutoRenewalAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAutoRenewalAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceAutoRenewalAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceAutoRenewalAttributeResponse setBody(ModifyInstanceAutoRenewalAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceAutoRenewalAttributeResponseBody getBody() {
        return this.body;
    }

}
