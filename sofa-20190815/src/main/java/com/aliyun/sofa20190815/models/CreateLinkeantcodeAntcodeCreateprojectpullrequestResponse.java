// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody body;

    public static CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse self = new CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse setBody(CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody getBody() {
        return this.body;
    }

}
