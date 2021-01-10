// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeHooksdeletehookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeHooksdeletehookResponseBody body;

    public static DeleteLinkeantcodeAntcodeHooksdeletehookResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeHooksdeletehookResponse self = new DeleteLinkeantcodeAntcodeHooksdeletehookResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeHooksdeletehookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeHooksdeletehookResponse setBody(DeleteLinkeantcodeAntcodeHooksdeletehookResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeHooksdeletehookResponseBody getBody() {
        return this.body;
    }

}
