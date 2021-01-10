// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeStarsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeStarsResponseBody body;

    public static DeleteLinkeantcodeAntcodeStarsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeStarsResponse self = new DeleteLinkeantcodeAntcodeStarsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeStarsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeStarsResponse setBody(DeleteLinkeantcodeAntcodeStarsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeStarsResponseBody getBody() {
        return this.body;
    }

}
