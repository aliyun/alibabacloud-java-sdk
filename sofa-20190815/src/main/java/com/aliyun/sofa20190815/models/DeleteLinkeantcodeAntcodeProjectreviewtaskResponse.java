// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeProjectreviewtaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBody body;

    public static DeleteLinkeantcodeAntcodeProjectreviewtaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeProjectreviewtaskResponse self = new DeleteLinkeantcodeAntcodeProjectreviewtaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeProjectreviewtaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeProjectreviewtaskResponse setBody(DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeProjectreviewtaskResponseBody getBody() {
        return this.body;
    }

}
