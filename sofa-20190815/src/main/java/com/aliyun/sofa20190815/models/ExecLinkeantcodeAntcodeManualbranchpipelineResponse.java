// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeManualbranchpipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody body;

    public static ExecLinkeantcodeAntcodeManualbranchpipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeManualbranchpipelineResponse self = new ExecLinkeantcodeAntcodeManualbranchpipelineResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeManualbranchpipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeantcodeAntcodeManualbranchpipelineResponse setBody(ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody getBody() {
        return this.body;
    }

}
