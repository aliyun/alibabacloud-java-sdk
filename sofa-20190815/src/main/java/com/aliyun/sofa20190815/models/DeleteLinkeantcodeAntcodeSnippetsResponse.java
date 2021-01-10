// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeSnippetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeSnippetsResponseBody body;

    public static DeleteLinkeantcodeAntcodeSnippetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeSnippetsResponse self = new DeleteLinkeantcodeAntcodeSnippetsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeSnippetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeSnippetsResponse setBody(DeleteLinkeantcodeAntcodeSnippetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeSnippetsResponseBody getBody() {
        return this.body;
    }

}
