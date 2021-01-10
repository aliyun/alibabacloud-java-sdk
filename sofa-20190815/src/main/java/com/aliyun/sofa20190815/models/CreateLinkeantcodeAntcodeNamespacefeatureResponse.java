// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeNamespacefeatureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodeNamespacefeatureResponseBody body;

    public static CreateLinkeantcodeAntcodeNamespacefeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeNamespacefeatureResponse self = new CreateLinkeantcodeAntcodeNamespacefeatureResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeNamespacefeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodeNamespacefeatureResponse setBody(CreateLinkeantcodeAntcodeNamespacefeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodeNamespacefeatureResponseBody getBody() {
        return this.body;
    }

}
