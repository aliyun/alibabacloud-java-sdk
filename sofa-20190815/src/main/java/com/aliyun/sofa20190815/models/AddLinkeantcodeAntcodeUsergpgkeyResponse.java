// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeantcodeAntcodeUsergpgkeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeantcodeAntcodeUsergpgkeyResponseBody body;

    public static AddLinkeantcodeAntcodeUsergpgkeyResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeantcodeAntcodeUsergpgkeyResponse self = new AddLinkeantcodeAntcodeUsergpgkeyResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeantcodeAntcodeUsergpgkeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeantcodeAntcodeUsergpgkeyResponse setBody(AddLinkeantcodeAntcodeUsergpgkeyResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeantcodeAntcodeUsergpgkeyResponseBody getBody() {
        return this.body;
    }

}
