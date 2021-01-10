// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeProjectsgcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeantcodeAntcodeProjectsgcResponseBody body;

    public static ExecLinkeantcodeAntcodeProjectsgcResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeProjectsgcResponse self = new ExecLinkeantcodeAntcodeProjectsgcResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeProjectsgcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeantcodeAntcodeProjectsgcResponse setBody(ExecLinkeantcodeAntcodeProjectsgcResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeantcodeAntcodeProjectsgcResponseBody getBody() {
        return this.body;
    }

}
