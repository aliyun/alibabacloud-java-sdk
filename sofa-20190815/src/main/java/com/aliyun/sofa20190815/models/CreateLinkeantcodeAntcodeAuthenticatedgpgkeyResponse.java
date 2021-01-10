// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponseBody body;

    public static CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponse self = new CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponse setBody(CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponseBody getBody() {
        return this.body;
    }

}
