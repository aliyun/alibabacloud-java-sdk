// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeUserkeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeUserkeysResponseBody body;

    public static DeleteLinkeantcodeAntcodeUserkeysResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeUserkeysResponse self = new DeleteLinkeantcodeAntcodeUserkeysResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeUserkeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeUserkeysResponse setBody(DeleteLinkeantcodeAntcodeUserkeysResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeUserkeysResponseBody getBody() {
        return this.body;
    }

}
