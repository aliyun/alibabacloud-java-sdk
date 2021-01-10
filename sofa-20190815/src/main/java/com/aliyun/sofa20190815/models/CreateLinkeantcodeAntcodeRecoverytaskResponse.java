// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeRecoverytaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodeRecoverytaskResponseBody body;

    public static CreateLinkeantcodeAntcodeRecoverytaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeRecoverytaskResponse self = new CreateLinkeantcodeAntcodeRecoverytaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeRecoverytaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodeRecoverytaskResponse setBody(CreateLinkeantcodeAntcodeRecoverytaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodeRecoverytaskResponseBody getBody() {
        return this.body;
    }

}
