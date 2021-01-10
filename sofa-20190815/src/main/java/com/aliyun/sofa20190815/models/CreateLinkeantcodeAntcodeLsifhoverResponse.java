// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeLsifhoverResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodeLsifhoverResponseBody body;

    public static CreateLinkeantcodeAntcodeLsifhoverResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeLsifhoverResponse self = new CreateLinkeantcodeAntcodeLsifhoverResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeLsifhoverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodeLsifhoverResponse setBody(CreateLinkeantcodeAntcodeLsifhoverResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodeLsifhoverResponseBody getBody() {
        return this.body;
    }

}
