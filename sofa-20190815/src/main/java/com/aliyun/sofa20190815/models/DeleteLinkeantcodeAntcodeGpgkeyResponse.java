// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeGpgkeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeGpgkeyResponseBody body;

    public static DeleteLinkeantcodeAntcodeGpgkeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeGpgkeyResponse self = new DeleteLinkeantcodeAntcodeGpgkeyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeGpgkeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeGpgkeyResponse setBody(DeleteLinkeantcodeAntcodeGpgkeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeGpgkeyResponseBody getBody() {
        return this.body;
    }

}
