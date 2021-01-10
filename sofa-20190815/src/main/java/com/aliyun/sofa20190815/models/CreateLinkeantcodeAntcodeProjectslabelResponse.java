// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeProjectslabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodeProjectslabelResponseBody body;

    public static CreateLinkeantcodeAntcodeProjectslabelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeProjectslabelResponse self = new CreateLinkeantcodeAntcodeProjectslabelResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeProjectslabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodeProjectslabelResponse setBody(CreateLinkeantcodeAntcodeProjectslabelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodeProjectslabelResponseBody getBody() {
        return this.body;
    }

}
