// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodePullrequestissueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodePullrequestissueResponseBody body;

    public static CreateLinkeantcodeAntcodePullrequestissueResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodePullrequestissueResponse self = new CreateLinkeantcodeAntcodePullrequestissueResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodePullrequestissueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodePullrequestissueResponse setBody(CreateLinkeantcodeAntcodePullrequestissueResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodePullrequestissueResponseBody getBody() {
        return this.body;
    }

}
