// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponseBody body;

    public static DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponse self = new DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponse setBody(DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponseBody getBody() {
        return this.body;
    }

}
