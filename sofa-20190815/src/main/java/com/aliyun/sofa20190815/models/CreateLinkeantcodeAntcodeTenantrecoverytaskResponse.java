// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeTenantrecoverytaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodeTenantrecoverytaskResponseBody body;

    public static CreateLinkeantcodeAntcodeTenantrecoverytaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeTenantrecoverytaskResponse self = new CreateLinkeantcodeAntcodeTenantrecoverytaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeTenantrecoverytaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodeTenantrecoverytaskResponse setBody(CreateLinkeantcodeAntcodeTenantrecoverytaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodeTenantrecoverytaskResponseBody getBody() {
        return this.body;
    }

}
