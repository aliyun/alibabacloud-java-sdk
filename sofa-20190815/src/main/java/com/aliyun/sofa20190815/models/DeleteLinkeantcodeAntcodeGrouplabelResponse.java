// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeGrouplabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeGrouplabelResponseBody body;

    public static DeleteLinkeantcodeAntcodeGrouplabelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeGrouplabelResponse self = new DeleteLinkeantcodeAntcodeGrouplabelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeGrouplabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeGrouplabelResponse setBody(DeleteLinkeantcodeAntcodeGrouplabelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeGrouplabelResponseBody getBody() {
        return this.body;
    }

}
