// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeUnlockprojectvariableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeantcodeAntcodeUnlockprojectvariableResponseBody body;

    public static ExecLinkeantcodeAntcodeUnlockprojectvariableResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeUnlockprojectvariableResponse self = new ExecLinkeantcodeAntcodeUnlockprojectvariableResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeUnlockprojectvariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeantcodeAntcodeUnlockprojectvariableResponse setBody(ExecLinkeantcodeAntcodeUnlockprojectvariableResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeantcodeAntcodeUnlockprojectvariableResponseBody getBody() {
        return this.body;
    }

}
