// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeantcodeAntcodeUsergpgkeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveLinkeantcodeAntcodeUsergpgkeyResponseBody body;

    public static RemoveLinkeantcodeAntcodeUsergpgkeyResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeantcodeAntcodeUsergpgkeyResponse self = new RemoveLinkeantcodeAntcodeUsergpgkeyResponse();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeantcodeAntcodeUsergpgkeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveLinkeantcodeAntcodeUsergpgkeyResponse setBody(RemoveLinkeantcodeAntcodeUsergpgkeyResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveLinkeantcodeAntcodeUsergpgkeyResponseBody getBody() {
        return this.body;
    }

}
