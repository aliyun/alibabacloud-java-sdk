// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeantcodeAntcodeProjectsserviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeantcodeAntcodeProjectsserviceResponseBody body;

    public static AddLinkeantcodeAntcodeProjectsserviceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeantcodeAntcodeProjectsserviceResponse self = new AddLinkeantcodeAntcodeProjectsserviceResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeantcodeAntcodeProjectsserviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeantcodeAntcodeProjectsserviceResponse setBody(AddLinkeantcodeAntcodeProjectsserviceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeantcodeAntcodeProjectsserviceResponseBody getBody() {
        return this.body;
    }

}
