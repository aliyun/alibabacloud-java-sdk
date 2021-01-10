// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeProjectreviewtaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodeProjectreviewtaskResponseBody body;

    public static CreateLinkeantcodeAntcodeProjectreviewtaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeProjectreviewtaskResponse self = new CreateLinkeantcodeAntcodeProjectreviewtaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeProjectreviewtaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodeProjectreviewtaskResponse setBody(CreateLinkeantcodeAntcodeProjectreviewtaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodeProjectreviewtaskResponseBody getBody() {
        return this.body;
    }

}
