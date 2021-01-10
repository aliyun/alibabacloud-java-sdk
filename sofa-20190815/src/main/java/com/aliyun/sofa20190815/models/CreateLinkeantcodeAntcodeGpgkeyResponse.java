// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeGpgkeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodeGpgkeyResponseBody body;

    public static CreateLinkeantcodeAntcodeGpgkeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeGpgkeyResponse self = new CreateLinkeantcodeAntcodeGpgkeyResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeGpgkeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodeGpgkeyResponse setBody(CreateLinkeantcodeAntcodeGpgkeyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodeGpgkeyResponseBody getBody() {
        return this.body;
    }

}
