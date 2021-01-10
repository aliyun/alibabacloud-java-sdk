// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeProjectfeatureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeProjectfeatureResponseBody body;

    public static DeleteLinkeantcodeAntcodeProjectfeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeProjectfeatureResponse self = new DeleteLinkeantcodeAntcodeProjectfeatureResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeProjectfeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeProjectfeatureResponse setBody(DeleteLinkeantcodeAntcodeProjectfeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeProjectfeatureResponseBody getBody() {
        return this.body;
    }

}
