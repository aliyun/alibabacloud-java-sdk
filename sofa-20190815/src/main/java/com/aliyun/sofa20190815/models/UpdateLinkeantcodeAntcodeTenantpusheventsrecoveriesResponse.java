// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody body;

    public static UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse self = new UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponse setBody(UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeantcodeAntcodeTenantpusheventsrecoveriesResponseBody getBody() {
        return this.body;
    }

}
