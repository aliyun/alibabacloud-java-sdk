// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeAcceptreviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeantcodeAntcodeAcceptreviewResponseBody body;

    public static ExecLinkeantcodeAntcodeAcceptreviewResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeAcceptreviewResponse self = new ExecLinkeantcodeAntcodeAcceptreviewResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeAcceptreviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeantcodeAntcodeAcceptreviewResponse setBody(ExecLinkeantcodeAntcodeAcceptreviewResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeantcodeAntcodeAcceptreviewResponseBody getBody() {
        return this.body;
    }

}
