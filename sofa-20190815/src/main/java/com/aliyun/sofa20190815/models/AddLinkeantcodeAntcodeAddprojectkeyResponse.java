// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeantcodeAntcodeAddprojectkeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeantcodeAntcodeAddprojectkeyResponseBody body;

    public static AddLinkeantcodeAntcodeAddprojectkeyResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeantcodeAntcodeAddprojectkeyResponse self = new AddLinkeantcodeAntcodeAddprojectkeyResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeantcodeAntcodeAddprojectkeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeantcodeAntcodeAddprojectkeyResponse setBody(AddLinkeantcodeAntcodeAddprojectkeyResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeantcodeAntcodeAddprojectkeyResponseBody getBody() {
        return this.body;
    }

}
