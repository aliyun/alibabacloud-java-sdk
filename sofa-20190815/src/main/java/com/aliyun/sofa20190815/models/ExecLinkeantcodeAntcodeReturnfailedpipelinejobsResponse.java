// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeReturnfailedpipelinejobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeantcodeAntcodeReturnfailedpipelinejobsResponseBody body;

    public static ExecLinkeantcodeAntcodeReturnfailedpipelinejobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeReturnfailedpipelinejobsResponse self = new ExecLinkeantcodeAntcodeReturnfailedpipelinejobsResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeReturnfailedpipelinejobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeantcodeAntcodeReturnfailedpipelinejobsResponse setBody(ExecLinkeantcodeAntcodeReturnfailedpipelinejobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeantcodeAntcodeReturnfailedpipelinejobsResponseBody getBody() {
        return this.body;
    }

}
