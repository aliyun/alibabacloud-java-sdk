// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeNamespacesidservicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodeNamespacesidservicesResponseBody body;

    public static CreateLinkeantcodeAntcodeNamespacesidservicesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeNamespacesidservicesResponse self = new CreateLinkeantcodeAntcodeNamespacesidservicesResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeNamespacesidservicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodeNamespacesidservicesResponse setBody(CreateLinkeantcodeAntcodeNamespacesidservicesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodeNamespacesidservicesResponseBody getBody() {
        return this.body;
    }

}
