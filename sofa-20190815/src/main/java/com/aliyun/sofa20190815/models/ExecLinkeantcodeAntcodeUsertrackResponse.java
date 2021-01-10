// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeUsertrackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeantcodeAntcodeUsertrackResponseBody body;

    public static ExecLinkeantcodeAntcodeUsertrackResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeUsertrackResponse self = new ExecLinkeantcodeAntcodeUsertrackResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeUsertrackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeantcodeAntcodeUsertrackResponse setBody(ExecLinkeantcodeAntcodeUsertrackResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeantcodeAntcodeUsertrackResponseBody getBody() {
        return this.body;
    }

}
