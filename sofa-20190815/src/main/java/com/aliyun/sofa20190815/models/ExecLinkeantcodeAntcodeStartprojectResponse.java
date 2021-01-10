// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeStartprojectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeantcodeAntcodeStartprojectResponseBody body;

    public static ExecLinkeantcodeAntcodeStartprojectResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeStartprojectResponse self = new ExecLinkeantcodeAntcodeStartprojectResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeStartprojectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeantcodeAntcodeStartprojectResponse setBody(ExecLinkeantcodeAntcodeStartprojectResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeantcodeAntcodeStartprojectResponseBody getBody() {
        return this.body;
    }

}
