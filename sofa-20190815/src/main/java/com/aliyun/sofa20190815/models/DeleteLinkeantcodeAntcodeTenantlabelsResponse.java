// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeTenantlabelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeTenantlabelsResponseBody body;

    public static DeleteLinkeantcodeAntcodeTenantlabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeTenantlabelsResponse self = new DeleteLinkeantcodeAntcodeTenantlabelsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeTenantlabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeTenantlabelsResponse setBody(DeleteLinkeantcodeAntcodeTenantlabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeTenantlabelsResponseBody getBody() {
        return this.body;
    }

}
