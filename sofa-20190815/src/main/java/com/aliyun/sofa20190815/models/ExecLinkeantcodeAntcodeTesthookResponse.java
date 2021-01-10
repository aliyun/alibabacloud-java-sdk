// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeTesthookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeantcodeAntcodeTesthookResponseBody body;

    public static ExecLinkeantcodeAntcodeTesthookResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeTesthookResponse self = new ExecLinkeantcodeAntcodeTesthookResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeTesthookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeantcodeAntcodeTesthookResponse setBody(ExecLinkeantcodeAntcodeTesthookResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeantcodeAntcodeTesthookResponseBody getBody() {
        return this.body;
    }

}
