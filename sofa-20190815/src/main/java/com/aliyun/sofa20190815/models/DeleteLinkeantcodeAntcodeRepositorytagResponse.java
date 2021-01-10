// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeRepositorytagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeRepositorytagResponseBody body;

    public static DeleteLinkeantcodeAntcodeRepositorytagResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeRepositorytagResponse self = new DeleteLinkeantcodeAntcodeRepositorytagResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeRepositorytagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeRepositorytagResponse setBody(DeleteLinkeantcodeAntcodeRepositorytagResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeRepositorytagResponseBody getBody() {
        return this.body;
    }

}
