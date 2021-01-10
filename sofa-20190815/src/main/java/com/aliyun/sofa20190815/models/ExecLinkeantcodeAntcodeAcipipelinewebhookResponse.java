// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeAcipipelinewebhookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeantcodeAntcodeAcipipelinewebhookResponseBody body;

    public static ExecLinkeantcodeAntcodeAcipipelinewebhookResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeAcipipelinewebhookResponse self = new ExecLinkeantcodeAntcodeAcipipelinewebhookResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeAcipipelinewebhookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeantcodeAntcodeAcipipelinewebhookResponse setBody(ExecLinkeantcodeAntcodeAcipipelinewebhookResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeantcodeAntcodeAcipipelinewebhookResponseBody getBody() {
        return this.body;
    }

}
