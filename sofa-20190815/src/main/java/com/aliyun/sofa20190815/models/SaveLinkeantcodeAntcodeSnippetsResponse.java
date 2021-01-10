// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeantcodeAntcodeSnippetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveLinkeantcodeAntcodeSnippetsResponseBody body;

    public static SaveLinkeantcodeAntcodeSnippetsResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeantcodeAntcodeSnippetsResponse self = new SaveLinkeantcodeAntcodeSnippetsResponse();
        return TeaModel.build(map, self);
    }

    public SaveLinkeantcodeAntcodeSnippetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveLinkeantcodeAntcodeSnippetsResponse setBody(SaveLinkeantcodeAntcodeSnippetsResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveLinkeantcodeAntcodeSnippetsResponseBody getBody() {
        return this.body;
    }

}
