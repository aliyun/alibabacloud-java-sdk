// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeantcodeAntcodeHookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeantcodeAntcodeHookResponseBody body;

    public static AddLinkeantcodeAntcodeHookResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeantcodeAntcodeHookResponse self = new AddLinkeantcodeAntcodeHookResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeantcodeAntcodeHookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeantcodeAntcodeHookResponse setBody(AddLinkeantcodeAntcodeHookResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeantcodeAntcodeHookResponseBody getBody() {
        return this.body;
    }

}
