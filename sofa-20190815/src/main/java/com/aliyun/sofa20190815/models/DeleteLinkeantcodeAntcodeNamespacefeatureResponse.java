// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeNamespacefeatureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeNamespacefeatureResponseBody body;

    public static DeleteLinkeantcodeAntcodeNamespacefeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeNamespacefeatureResponse self = new DeleteLinkeantcodeAntcodeNamespacefeatureResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeNamespacefeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeNamespacefeatureResponse setBody(DeleteLinkeantcodeAntcodeNamespacefeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeNamespacefeatureResponseBody getBody() {
        return this.body;
    }

}
