// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeApicreatereviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodeApicreatereviewResponseBody body;

    public static CreateLinkeantcodeAntcodeApicreatereviewResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeApicreatereviewResponse self = new CreateLinkeantcodeAntcodeApicreatereviewResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeApicreatereviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodeApicreatereviewResponse setBody(CreateLinkeantcodeAntcodeApicreatereviewResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodeApicreatereviewResponseBody getBody() {
        return this.body;
    }

}
