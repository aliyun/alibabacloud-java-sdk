// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeUserfeatureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodeUserfeatureResponseBody body;

    public static CreateLinkeantcodeAntcodeUserfeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeUserfeatureResponse self = new CreateLinkeantcodeAntcodeUserfeatureResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeUserfeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodeUserfeatureResponse setBody(CreateLinkeantcodeAntcodeUserfeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodeUserfeatureResponseBody getBody() {
        return this.body;
    }

}
