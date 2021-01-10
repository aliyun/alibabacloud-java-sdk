// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeRevokepersonalaccesstokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeantcodeAntcodeRevokepersonalaccesstokenResponseBody body;

    public static ExecLinkeantcodeAntcodeRevokepersonalaccesstokenResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeRevokepersonalaccesstokenResponse self = new ExecLinkeantcodeAntcodeRevokepersonalaccesstokenResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeRevokepersonalaccesstokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeantcodeAntcodeRevokepersonalaccesstokenResponse setBody(ExecLinkeantcodeAntcodeRevokepersonalaccesstokenResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeantcodeAntcodeRevokepersonalaccesstokenResponseBody getBody() {
        return this.body;
    }

}
