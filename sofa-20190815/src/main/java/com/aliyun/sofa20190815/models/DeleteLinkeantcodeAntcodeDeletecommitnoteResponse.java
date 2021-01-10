// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeDeletecommitnoteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeDeletecommitnoteResponseBody body;

    public static DeleteLinkeantcodeAntcodeDeletecommitnoteResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeDeletecommitnoteResponse self = new DeleteLinkeantcodeAntcodeDeletecommitnoteResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeDeletecommitnoteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeDeletecommitnoteResponse setBody(DeleteLinkeantcodeAntcodeDeletecommitnoteResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeDeletecommitnoteResponseBody getBody() {
        return this.body;
    }

}
