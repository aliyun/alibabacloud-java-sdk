// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeUserkeysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodeUserkeysResponseBody body;

    public static CreateLinkeantcodeAntcodeUserkeysResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeUserkeysResponse self = new CreateLinkeantcodeAntcodeUserkeysResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeUserkeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodeUserkeysResponse setBody(CreateLinkeantcodeAntcodeUserkeysResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodeUserkeysResponseBody getBody() {
        return this.body;
    }

}
