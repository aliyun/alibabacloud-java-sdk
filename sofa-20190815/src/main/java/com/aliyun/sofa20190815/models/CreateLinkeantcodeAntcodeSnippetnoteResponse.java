// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeSnippetnoteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody body;

    public static CreateLinkeantcodeAntcodeSnippetnoteResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeSnippetnoteResponse self = new CreateLinkeantcodeAntcodeSnippetnoteResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodeSnippetnoteResponse setBody(CreateLinkeantcodeAntcodeSnippetnoteResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodeSnippetnoteResponseBody getBody() {
        return this.body;
    }

}
