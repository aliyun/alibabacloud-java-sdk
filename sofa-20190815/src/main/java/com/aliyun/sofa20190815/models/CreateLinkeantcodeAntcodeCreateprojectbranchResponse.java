// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeCreateprojectbranchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodeCreateprojectbranchResponseBody body;

    public static CreateLinkeantcodeAntcodeCreateprojectbranchResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeCreateprojectbranchResponse self = new CreateLinkeantcodeAntcodeCreateprojectbranchResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeCreateprojectbranchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodeCreateprojectbranchResponse setBody(CreateLinkeantcodeAntcodeCreateprojectbranchResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodeCreateprojectbranchResponseBody getBody() {
        return this.body;
    }

}
