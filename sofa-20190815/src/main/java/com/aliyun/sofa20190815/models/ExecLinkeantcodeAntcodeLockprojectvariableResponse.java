// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeLockprojectvariableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeantcodeAntcodeLockprojectvariableResponseBody body;

    public static ExecLinkeantcodeAntcodeLockprojectvariableResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeLockprojectvariableResponse self = new ExecLinkeantcodeAntcodeLockprojectvariableResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeLockprojectvariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeantcodeAntcodeLockprojectvariableResponse setBody(ExecLinkeantcodeAntcodeLockprojectvariableResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeantcodeAntcodeLockprojectvariableResponseBody getBody() {
        return this.body;
    }

}
