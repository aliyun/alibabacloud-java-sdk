// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBody body;

    public static GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse self = new GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse setBody(GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseBody getBody() {
        return this.body;
    }

}
