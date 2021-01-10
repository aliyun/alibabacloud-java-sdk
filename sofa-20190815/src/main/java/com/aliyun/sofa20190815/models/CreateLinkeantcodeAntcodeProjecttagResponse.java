// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeProjecttagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodeProjecttagResponseBody body;

    public static CreateLinkeantcodeAntcodeProjecttagResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeProjecttagResponse self = new CreateLinkeantcodeAntcodeProjecttagResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeProjecttagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodeProjecttagResponse setBody(CreateLinkeantcodeAntcodeProjecttagResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodeProjecttagResponseBody getBody() {
        return this.body;
    }

}
