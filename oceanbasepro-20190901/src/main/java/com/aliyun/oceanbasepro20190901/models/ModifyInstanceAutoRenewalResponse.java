// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyInstanceAutoRenewalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyInstanceAutoRenewalResponseBody body;

    public static ModifyInstanceAutoRenewalResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAutoRenewalResponse self = new ModifyInstanceAutoRenewalResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAutoRenewalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceAutoRenewalResponse setBody(ModifyInstanceAutoRenewalResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceAutoRenewalResponseBody getBody() {
        return this.body;
    }

}
