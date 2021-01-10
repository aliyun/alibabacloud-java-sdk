// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeDeleteprojectvariableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeDeleteprojectvariableResponseBody body;

    public static DeleteLinkeantcodeAntcodeDeleteprojectvariableResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeDeleteprojectvariableResponse self = new DeleteLinkeantcodeAntcodeDeleteprojectvariableResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeDeleteprojectvariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeDeleteprojectvariableResponse setBody(DeleteLinkeantcodeAntcodeDeleteprojectvariableResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeDeleteprojectvariableResponseBody getBody() {
        return this.body;
    }

}
