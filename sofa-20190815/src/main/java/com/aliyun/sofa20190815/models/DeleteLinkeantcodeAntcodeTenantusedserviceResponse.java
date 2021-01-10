// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeTenantusedserviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeTenantusedserviceResponseBody body;

    public static DeleteLinkeantcodeAntcodeTenantusedserviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeTenantusedserviceResponse self = new DeleteLinkeantcodeAntcodeTenantusedserviceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeTenantusedserviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeTenantusedserviceResponse setBody(DeleteLinkeantcodeAntcodeTenantusedserviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeTenantusedserviceResponseBody getBody() {
        return this.body;
    }

}
