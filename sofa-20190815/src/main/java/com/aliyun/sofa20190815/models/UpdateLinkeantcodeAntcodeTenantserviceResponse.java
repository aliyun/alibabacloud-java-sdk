// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeTenantserviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeantcodeAntcodeTenantserviceResponseBody body;

    public static UpdateLinkeantcodeAntcodeTenantserviceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeTenantserviceResponse self = new UpdateLinkeantcodeAntcodeTenantserviceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeTenantserviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeantcodeAntcodeTenantserviceResponse setBody(UpdateLinkeantcodeAntcodeTenantserviceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeantcodeAntcodeTenantserviceResponseBody getBody() {
        return this.body;
    }

}
