// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeProjectrepositorysearchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeantcodeAntcodeProjectrepositorysearchResponseBody body;

    public static ExecLinkeantcodeAntcodeProjectrepositorysearchResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeProjectrepositorysearchResponse self = new ExecLinkeantcodeAntcodeProjectrepositorysearchResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeProjectrepositorysearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeantcodeAntcodeProjectrepositorysearchResponse setBody(ExecLinkeantcodeAntcodeProjectrepositorysearchResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeantcodeAntcodeProjectrepositorysearchResponseBody getBody() {
        return this.body;
    }

}
