// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeSnippetsidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeantcodeAntcodeSnippetsidResponseBody body;

    public static UpdateLinkeantcodeAntcodeSnippetsidResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeSnippetsidResponse self = new UpdateLinkeantcodeAntcodeSnippetsidResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeSnippetsidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeantcodeAntcodeSnippetsidResponse setBody(UpdateLinkeantcodeAntcodeSnippetsidResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeantcodeAntcodeSnippetsidResponseBody getBody() {
        return this.body;
    }

}
