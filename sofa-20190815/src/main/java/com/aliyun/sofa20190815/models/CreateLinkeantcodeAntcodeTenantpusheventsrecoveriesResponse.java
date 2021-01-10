// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody body;

    public static CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse self = new CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse setBody(CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody getBody() {
        return this.body;
    }

}
