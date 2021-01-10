// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeGrouplabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodeGrouplabelResponseBody body;

    public static CreateLinkeantcodeAntcodeGrouplabelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeGrouplabelResponse self = new CreateLinkeantcodeAntcodeGrouplabelResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeGrouplabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodeGrouplabelResponse setBody(CreateLinkeantcodeAntcodeGrouplabelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodeGrouplabelResponseBody getBody() {
        return this.body;
    }

}
